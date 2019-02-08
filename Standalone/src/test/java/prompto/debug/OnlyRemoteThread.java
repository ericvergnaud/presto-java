package prompto.debug;

public class OnlyRemoteThread implements IThread {

	@Override
	public String getThreadId() {
		return "only";
	}
	
	@Override
	public String getName() {
		return getThreadId();
	}
	
	@Override
	public State getState() {
		return State.RUNNING;
	}
		
}
