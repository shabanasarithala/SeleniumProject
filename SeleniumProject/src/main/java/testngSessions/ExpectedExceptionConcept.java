package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void exam1() {

		System.out.println("exam1....");
		int i = 9 / 0;

	}

}
