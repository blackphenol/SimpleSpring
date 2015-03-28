package simple.practice.service.task;


public class SimpleTask implements Runnable{
	private SimpleCounter counter;
	private int num;
	public SimpleTask(SimpleCounter counter, int num) {
		this.counter = counter;
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=0; i<num; ++i){
			System.out.println("Thread-" + Thread.currentThread().getId() + ": " + counter.count());
		}
	}

	
}
