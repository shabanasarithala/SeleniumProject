package seleniumSessions;

public class WebsiteLaunchTest {
	public static void main(String[] args) {
		BrowserActions br = new BrowserActions();
		br.launch_browser( "chrome");
		br.launch_url( "https://www.google.com/");
		String title = br.get_pagetitle();
		System.out.println(title);
		if(title.equalsIgnoreCase( "google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		br.quit_browser();
	}

}
