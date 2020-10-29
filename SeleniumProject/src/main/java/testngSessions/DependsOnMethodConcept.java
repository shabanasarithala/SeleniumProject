package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test
	public void logIn() {
		System.out.println("log in started...");
		int i = 9/0;
		
	}
	
	@Test
	public void homePage() {
		System.out.println(" we are in home page...");
		
	}
	
	
	@Test(dependsOnMethods = "logIn" , enabled = true)
	public void search() {
		System.out.println("searching for element...");
		
	}

}
