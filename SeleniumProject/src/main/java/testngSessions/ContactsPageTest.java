package testngSessions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testngSessions.MyListenersTest.class)
public class ContactsPageTest extends BaseTest {

	@Test
	public void contactPageTitleTest() {
		System.out.println("contact page title test....");
	}

}
