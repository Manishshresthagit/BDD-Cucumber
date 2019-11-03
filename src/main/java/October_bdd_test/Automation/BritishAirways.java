package October_bdd_test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BritishAirways {
	public static WebDriver driver;
	public static void main( String[] args )
	{
		System.setProperty("webdriver.gecko.driver","C:/Eclipse/geckodriver.exe");
		driver =new FirefoxDriver();
		
		driver.get("https://www.britishairways.com");
    	driver.manage().window().maximize();
    	driver.findElement(By.className("ng-binding"));
    	
	}

}
