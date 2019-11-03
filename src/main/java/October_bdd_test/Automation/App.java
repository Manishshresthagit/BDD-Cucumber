package October_bdd_test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
    public static void main( String[] args )
    {
    	
    	System.setProperty("webdriver.gecko.driver","C:/Eclipse/geckodriver.exe");
    	driver =new FirefoxDriver();
      
    	driver.get("https://www.britishairways.com");
    	driver.manage().window().maximize();
    	driver.findElement(By.className("register")).click();
    	driver.findElement(By.id("email")).sendKeys("manishbshrestha@hotmail.co.uk");
    	driver.findElement(By.id("confirm-email")).sendKeys("manishbshrestha@hotmail.co.uk");
    	driver.findElement(By.id("pass")).sendKeys("manish");
    	driver.findElement(By.id("confirm-password")).sendKeys("manish");
    	driver.findElement(By.id("title"));
    	Select title = new Select(driver.findElement(By.id("title")));
    	title.selectByVisibleText("Mr");
    	driver.findElement(By.id("first-name")).sendKeys("manish");
    	driver.findElement(By.id("family-name")).sendKeys("shrestha");
    	WebElement radiobutton = driver.findElement(By.xpath(("//span[contains(text(),'Register with ba.com')]")));
    	radiobutton.click();
    	WebElement radiobutton2 = driver.findElement(By.xpath(("//span[@class='radio-label'][contains(text(),'Join the Executive Club')]")));
    	radiobutton2.click();
    	
    	
    	WebElement checkbox = driver.findElement(By.className(("use-email-address")));
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", checkbox);
    	
    	checkbox.click();
    	
    	driver.findElement(By.id("homeaddress1")).sendKeys("Dartford");
    	
    	
    	}
    public static void launchBritishAirwaysUrl() {
		driver.get("https://www.britishairways.com");
    }
    
    public static void maximizewindow () {
    	driver.manage().window().maximize();
    }
    
    public static void toregister() {
    	driver.findElement(By.className("register")).click();
    }
    
    public static void email() {
    	driver.findElement(By.id("email")).sendKeys("manishbshrestha@hotmail.co.uk");
    }
    		
    		public static void toConfirmEmail () {
    			driver.findElement(By.id("confirm-email")).sendKeys("manishbshrestha@hotmail.co.uk");
    		}
    		
    				
    				
    			public static void password() {
    				driver.findElement(By.id("pass")).sendKeys("manish");
    			}
    			
    			public static void toConfirmPassowrd () {
    				driver.findElement(By.id("confirm-password")).sendKeys("manish");
    			
    			}
    			
    			public static void title() {
    				driver.findElement(By.id("title"));
    			}
    			
    			public static void toSelectTitle() {
    				Select title = new Select(driver.findElement(By.id("title")));
    				{
    				
    				
    				
    				
    				
    			

    	}
    	
    	
    	
    			
    	
    }
}
