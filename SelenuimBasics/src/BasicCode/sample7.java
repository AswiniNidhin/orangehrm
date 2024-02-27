package BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61405\\Desktop\\SelenuimFiles\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Aswini");
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("2345");
		driver.findElement(By.cssSelector("button[name=login]")).click();
	}

}
