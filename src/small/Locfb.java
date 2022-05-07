package small;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locfb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("omkar");
		
		//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("omii");
		//driver.findElement(By.cssSelector("#email")).sendKeys("ommmiiii");
		
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("patil");
		//driver.findElement(By.partialLinkText("Forgotten password")).click();
		//driver.findElement(By.xpath("//input[@id=\'pass\']")).sendKeys("komal");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("komalpatil");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		
}
}
