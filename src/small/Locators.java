package small;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		//WebElement username=driver.findElement(By.id("login-username"));
		//username.sendKeys("patilomkar1185@gmail.com");
		driver.findElement(By.id("login-username")).sendKeys("omkar");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.id("recaptcha-submit")).click();
		driver.findElement(By.tagName("Next")).click();
		
		
		
		
		
		
	}

}
