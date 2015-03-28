package simple.practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import simple.SpringContextTestBase;

public class GreetingTest extends SpringContextTestBase{
	@Autowired Greeting greeting;

	@Test
	public void test() {
		String msg = greeting.printGreeting("Jordan");
		assertTrue(msg.indexOf("Jordan")>0);
	}

}
