package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@BeforeSuite 
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass 
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test 
	public void test1() {
		System.out.println("test1....");
	}
	
	@Test
	public void test2() {
		System.out.println("test2....");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

}
