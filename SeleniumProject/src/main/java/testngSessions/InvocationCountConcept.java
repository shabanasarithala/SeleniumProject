package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount=10)
	public void getTitle() {
		System.out.println("got title......");
	}

}
