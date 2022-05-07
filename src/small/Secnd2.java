package small;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Secnd2 {
	public static void main(String[] args) {
		WebDriver driver=secondpr.opensecondpr();
		Dimension d=new Dimension(400,800);
		driver.manage().window().setSize(d);
		
		Point p=new Point(100,500);
		driver.manage().window().setPosition(p);
	}

}
