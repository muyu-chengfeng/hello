package behavioral.State;



public class NewState extends ThreadState {
	public NewState() {
		state = StateSet.NEW;
		System.out.println("新建线程");
	}
	
	public void start(ThreadContext tc) {
		System.out.println("调用了start()方法");
		if(state == StateSet.NEW)
			tc.setThreadState(new RunnableState());
		else
			System.out.println("当前线程不是新建状态");
	}
}
