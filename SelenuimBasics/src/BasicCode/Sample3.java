package BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\61405\\Desktop\\SelenuimFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Aswini");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.close();
 
	}

}

