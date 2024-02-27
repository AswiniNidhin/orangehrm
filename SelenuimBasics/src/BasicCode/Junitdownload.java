package BasicCode;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitdownload {
	@Test
	public void yahoo_Signin() {
		System.out.println("helloo..web page launch with geckodriver");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\61405\\Desktop\\SelenuimFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}

}
