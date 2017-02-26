package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import prompto.debug.IDebugRequest.ConnectRequest;
import prompto.debug.IDebugRequest.GetLineRequest;
import prompto.debug.IDebugRequest.InstallBreakpointRequest;
import prompto.debug.IDebugRequest.SuspendRequest;
import prompto.debug.IDebugRequest.ResumeRequest;
import prompto.debug.IDebugRequest.GetStatusRequest;
import prompto.debug.IDebugRequest.GetStackRequest;
import prompto.debug.IDebugRequest.GetVariablesRequest;
import prompto.debug.IDebugRequest.StepIntoRequest;
import prompto.debug.IDebugRequest.IsSteppingRequest;
import prompto.debug.IDebugRequest.StepOutRequest;
import prompto.debug.IDebugRequest.StepOverRequest;
import prompto.debug.IDebugResponse.GetLineResponse;
import prompto.debug.IDebugResponse.GetStatusResponse;
import prompto.debug.IDebugResponse.GetStackResponse;
import prompto.debug.IDebugResponse.GetVariablesResponse;
import prompto.debug.IDebugResponse.IsSteppingResponse;
import prompto.parser.ISection;

public class DebugRequestClient implements IDebugger {

	DebugEventServer listener;
	Supplier<Boolean> remote;
	boolean connected;
	String host;
	int port;
	
	public DebugRequestClient(Thread thread, String host, int port, IDebugEventListener listener) {
		this.listener = new DebugEventServer(listener);
		this.remote = ()->thread.isAlive();
		this.host = host;
		this.port = port;
	}

	public DebugRequestClient(Process process, String host, int port, IDebugEventListener listener) {
		this.listener = new DebugEventServer(listener);
		this.remote = ()->process.isAlive();
		this.host = host;
		this.port = port;
	}

	@Override
	public void connect() {
		listener.startListening();
		ConnectRequest request = new ConnectRequest();
		request.setPort(listener.port);
		int count = 0;
		while(remote.get() && !connected && ++count<=100) try {
			IDebugResponse ack = send(request, (e)->{});
			connected = ack!=null;
			Thread.sleep(100);
		} catch(InterruptedException e) {
			break;
		}
		if(!connected)
			throw new UnreachableException();
	}
	
	private IDebugResponse send(IDebugRequest request) {
		return send(request, null);
	}
	
	private IDebugResponse send(IDebugRequest request, Consumer<Exception> errorHandler) {
		LocalDebugger.showEvent("DebugRequestClient sends " + request.getType());
		try(Socket client = new Socket(host, port)) {
			try(OutputStream output = client.getOutputStream()) {
				sendRequest(output, request);
				try(InputStream input = client.getInputStream()) {
					IDebugResponse response = readResponse(input);
					LocalDebugger.showEvent("DebugRequestClient receives " + response.getType());
					return response;
				}
			}
		} catch(Exception e) {
			if(errorHandler!=null)
				errorHandler.accept(e);
			else
				e.printStackTrace(System.err);
			return null;
		}
	}


	private void sendRequest(OutputStream output, IDebugRequest request) throws Exception {
		Serializer.writeDebugRequest(output, request);
	}


	private IDebugResponse readResponse(InputStream input) throws Exception {
		return Serializer.readDebugResponse(input);
	}


	@Override
	public void setListener(IDebugEventListener listener) {
		this.listener.listener = listener;
	}
	

	@Override
	public Status getStatus(IThread thread) {
		if(!remote.get())
			return Status.TERMINATED;
		else
			return fetchStatus(thread);
	}

	private Status fetchStatus(IThread thread) {
		if(!connected)
			return Status.UNREACHABLE;
		IDebugRequest request = new GetStatusRequest(thread);
		IDebugResponse response = send(request) ;
		if(response instanceof GetStatusResponse)
			return ((GetStatusResponse)response).getStatus();
		else 
			return Status.UNREACHABLE;
	}

	@Override
	public IStack<?> getStack(IThread thread) {
		IDebugRequest request = new GetStackRequest(thread);
		IDebugResponse response = send(request) ;
		if(response instanceof GetStackResponse) {
			LeanStack stack = ((GetStackResponse)response).getStack();
			return new ClientStack(this, thread, stack);
		} else 
			throw new UnreachableException();
	}
	
	@Override
	public Collection<? extends IVariable> getVariables(IThread thread, IStackFrame frame) {
		IDebugRequest request = new GetVariablesRequest(thread, frame);
		IDebugResponse response = send(request) ;
		if(response instanceof GetVariablesResponse) {
			LeanVariableList variables = ((GetVariablesResponse)response).getVariables();
			return variables.stream()
					.map((v)->new ClientVariable(thread, frame, v))
					.collect(Collectors.toList());
		} else 
			throw new UnreachableException();
	}

	@Override
	public int getLine(IThread thread) {
		IDebugRequest request = new GetLineRequest(thread);
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineResponse)
			return ((GetLineResponse)response).getLine();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isStepping(IThread thread) {
		if(!connected)
			return false;
		IDebugRequest request = new IsSteppingRequest(thread);
		IDebugResponse response = send(request) ;
		if(response instanceof IsSteppingResponse)
			return ((IsSteppingResponse)response).isStepping();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isSuspended(IThread thread) {
		if(!connected || isTerminated())
			return false;
		return fetchStatus(thread)==Status.SUSPENDED;
	}

	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	@Override
	public boolean isTerminated() {
		return listener==null || !listener.isListening();
	}

	@Override
	public void notifyTerminated() {
		if(listener!=null)
			listener.stopListening();
	}

	@Override
	public boolean canResume(IThread thread) {
		return !isTerminated() && isSuspended(thread);
	}

	@Override
	public boolean canSuspend(IThread thread) {
		return !isTerminated() && !isSuspended(thread);
	}

	@Override
	public boolean canStepInto(IThread thread) {
		return isSuspended(thread);
	}

	@Override
	public boolean canStepOver(IThread thread) {
		return isSuspended(thread);
	}

	@Override
	public boolean canStepOut(IThread thread) {
		return isSuspended(thread);
	}

	@Override
	public void suspend(IThread thread) {
		IDebugRequest request = new SuspendRequest(thread);
		send(request);
	}

	@Override
	public void resume(IThread thread) {
		IDebugRequest request = new ResumeRequest(thread);
		send(request);
	}

	@Override
	public void terminate() {
		connected = false;
		listener.stopListening();
	}

	@Override
	public void stepInto(IThread thread) {
		IDebugRequest request = new StepIntoRequest(thread);
		send(request);
	}

	@Override
	public void stepOut(IThread thread) {
		IDebugRequest request = new StepOutRequest(thread);
		send(request);
	}

	@Override
	public void stepOver(IThread thread) {
		IDebugRequest request = new StepOverRequest();
		send(request);
	}
	
	@Override
	public void installBreakpoint(ISection section) {
		IDebugRequest request = new InstallBreakpointRequest(section);
		send(request);
	}

}
