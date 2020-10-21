package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_FileUpload {
	static By choose_file = By.name("upfile");
	static By confirm_upload = By.tagName("h1");
	static By press_btn = By.xpath("//input[@type='submit']");

	public static void main(String[] args) throws InterruptedException {
		
		//https://cgi-lib.berkeley.edu/ex/fup.html
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get( "https://cgi-lib.berkeley.edu/ex/fup.html");
		 ElementUtil elementutil = new ElementUtil(driver);
		 elementutil.sendkeys(choose_file, "C:\\Users\\pc\\Desktop\\shabana.txt");
		 elementutil.click(press_btn);
		 Thread.sleep( 5000);
		 String confrm_txt = elementutil.get_text(confirm_upload);
		 System.out.println(confrm_txt);
		 
		 if(confrm_txt.equalsIgnoreCase( "file upload results")) {
			 System.out.println("file uploaded sucessfully");
		 }
		 else {
			 System.out.println("file upload failed");
		 }

	}

}
