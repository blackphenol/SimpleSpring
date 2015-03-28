package simple.practice.service.task;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;

import simple.SpringContextTestBase;

public class TaskExecutorTest extends SpringContextTestBase{

	@Autowired
	private SyncTaskExecutor syncExecutor;
	@Autowired
	private SimpleAsyncTaskExecutor asyncExecutor;
	
	SimpleCounter counter;
	SimpleTask task1;
	SimpleTask task2;
	SimpleTask task3;
	
	@Before
	public void before(){
		this.counter = new SimpleCounter(10);
		this.task1 = new SimpleTask(counter, 5);
		this.task2 = new SimpleTask(counter, 10);
		this.task3 = new SimpleTask(counter, 5);
	}
	
	@Test
	public void testSync(){
		//single thread
		syncExecutor.execute(task1);
		syncExecutor.execute(task2);
		syncExecutor.execute(task3);
	
	}
	
	@Test
	public void testASync(){
		//multi thread
		asyncExecutor.execute(task1);
		asyncExecutor.execute(task2);
		asyncExecutor.execute(task3);
	}
}
