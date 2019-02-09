package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import prompto.debug.IDebugEvent;
import prompto.utils.Logger;

/* an implementation which uses JavaSerialization to communicate with the client */
public class JavaDebugEventAdapter implements IDebugEventAdapter {

	static Logger logger = new Logger();
	
	String host;
	int port;
	
	public JavaDebugEventAdapter(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void handleConnectedEvent(IDebugEvent.Connected event) {
		send(event);
	}
	
	@Override
	public void handleStartedEvent(IWorker worker) {
		send(new IDebugEvent.Started(worker));
	}
	
	@Override
	public void handleSuspendedEvent(IWorker worker, SuspendReason reason) {
		send(new IDebugEvent.Suspended(worker, reason));
	}

	@Override
	public void handleResumedEvent(IWorker worker, ResumeReason reason) {
		send(new IDebugEvent.Resumed(worker, reason));
	}
	
	@Override
	public void handleCompletedEvent(IWorker worker) {
		send(new IDebugEvent.Completed(worker));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new IDebugEvent.Terminated());
	}

	protected IAcknowledgement send(IDebugEvent event) {
		try(Socket client = new Socket(host, port)) {
			try(OutputStream output = client.getOutputStream()) {
				logger.debug(()->"DebugEventClient sends " + event.getType());
				sendDebugEvent(output, event);
				try(InputStream input = client.getInputStream()) {
					IAcknowledgement ack = readAcknowledgement(input);
					logger.debug(()->"DebugEventClient receives " + ack.getType());
					return ack;
				}
			}
		} catch(Exception e) {
			e.printStackTrace(System.err);
			return null;
		}
	}

	private void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
		Serializer.writeDebugEvent(output, event);
	}

	private IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.readAcknowledgement(input);
	}

}
