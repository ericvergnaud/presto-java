package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;

import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.WorkerCompletedDebugEvent;
import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.event.IDebugEvent;
import prompto.debug.event.ReadyDebugEvent;
import prompto.debug.event.WorkerResumedDebugEvent;
import prompto.debug.event.WorkerStartedDebugEvent;
import prompto.debug.event.WorkerSuspendedDebugEvent;
import prompto.debug.worker.IWorker;
import prompto.debug.event.TerminatedDebugEvent;
import prompto.utils.Logger;

public abstract class DebugEventAdapterBase implements IDebugEventAdapter {

	static Logger logger = new Logger();
	
	@Override
	public void handleConnectedEvent(ConnectedDebugEvent event) {
		send(event);
	}
	
	@Override
	public void handleReadyEvent() {
		send(new ReadyDebugEvent());
	}
	
	@Override
	public void handleStartedEvent(IWorker worker) {
		send(new WorkerStartedDebugEvent(worker));
	}
	
	@Override
	public void handleSuspendedEvent(IWorker worker, SuspendReason reason) {
		send(new WorkerSuspendedDebugEvent(worker, reason));
	}

	@Override
	public void handleResumedEvent(IWorker worker, ResumeReason reason) {
		send(new WorkerResumedDebugEvent(worker, reason));
	}
	
	@Override
	public void handleCompletedEvent(IWorker worker) {
		send(new WorkerCompletedDebugEvent(worker));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new TerminatedDebugEvent());
	}

	protected abstract IAcknowledgement send(IDebugEvent event);

	protected void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
		Serializer.writeMessage(output, event);
	}

	protected IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.readAcknowledgement(input);
	}

}
