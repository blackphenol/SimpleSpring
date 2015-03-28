package simple.practice.service.task;

public class SimpleCounter {

	private int start;
	
	public SimpleCounter(int start) {
		super();
		this.start = start;
	}



	synchronized
	public int count(){
		++start;
		return start;
	}
}
