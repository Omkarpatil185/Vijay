package small;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliExpliWait {
	public static void main(String[] args) {
		WebDriver driver = secondpr.opensecondpr();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		
		//WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
		
		
	}
		public void enterpass( String Value,WebDriver driver) {

			WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(2000));
			wait.pollingEvery(Duration.ofSeconds(100));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(name));
			name.sendKeys("9552988356");
			
			
		}
}