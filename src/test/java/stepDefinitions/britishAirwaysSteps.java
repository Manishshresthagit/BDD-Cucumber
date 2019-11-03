package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class britishAirwaysSteps {
	public static WebDriver driver;

	@Given("^launch british airways url \"([^\"]*)\"$")
	public void launch_british_airways_url(String arg1) throws Throwable {

		System.setProperty("webdriver.gecko.driver", "C:/Eclipse/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get(arg1);
		driver.manage().window().maximize();
		Thread.sleep(8000);

	}

	@Given("^click on Registration Link$")
	public void click_on_Registration_Link() throws Throwable {
		driver.findElement(By.className("register")).click();

	}

	@Then("^check for registration page is opened$")
	public void check_for_registration_page_is_opened() throws Throwable {
		String regPage = driver.getTitle();
		if (regPage.contains("Registration Page")) {
			System.out.println("passed : Registration page is opened");
		} else {
			System.out.println("failed : Registration page is not avaliable");

		}
	}

	@Given("^Enter email id \"([^\"]*)\"$")
	public void enter_email_id(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("manishbshrestha@hotmail.co.uk");

	}

	@Then("^Confirm email address \"([^\"]*)\"$")
	public void confirm_email_address(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("confirm-email")).sendKeys("manishbshrestha@hotmail.couk");

	}

	@Then("^Choose Password \"([^\"]*)\"$")
	public void choose_Password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("manish123");

	}

	@Then("^Confirm Password \"([^\"]*)\"$")
	public void confirm_Password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("confirm-password")).sendKeys("manish123");

	}

	@Then("^Select Title \"([^\"]*)\"$")
	public void select_Title(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mr");

	}

	@Then("^Enter First name \"([^\"]*)\"$")
	public void enter_First_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("first-name")).sendKeys("manish");

	}

	@Then("^Enter Last name \"([^\"]*)\"$")
	public void enter_Last_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("family-name")).sendKeys("shrestha");

	}

	@Then("^Select a Registration option$")
	public void select_a_Registration_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]"));
		radioBtn.click();

	}

	@Then("^Click a radio button \"([^\"]*)\"$")
	public void click_a_radio_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.className("radio-label"));
		radioBtn.click();
	}

	@Then("^Click on Join now$")
	public void click_on_Join_now() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.id("submitButton"));
		radioBtn.click();
	}

	@Then("^Select a radio button \"([^\"]*)\"$")
	public void select_a_radio_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.className("radio-label"));
		radioBtn.click();
	}

	@Then("^Enter Address line (\\d+) \"([^\"]*)\"$")
	public void enter_Address_line(int arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("homeaddress1")).sendKeys("Dartford");
	}

	@Then("^Town /city \"([^\"]*)\"$")
	public void town_city(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("homecity")).sendKeys("England");
	}

	@Then("^Enter Country/state \"([^\"]*)\"$")
	public void enter_Country_state(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("//input[@id='homestate']")).sendKeys("London");
	}

	@Then("^Enter Postcode/Zip code\"$")
	public void enter_Postcode_Zip_code() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("homepostalcode")).sendKeys("DA1 2QQ");
	}

	@Then("^Enter Country /Region of Residence$")
	public void enter_Country_Region_of_Residence() throws Throwable {
		driver.findElement(By.id("homecountryname")).sendKeys("0");

	}

	@Then("^Enter country/Region where your mobile/cell phone is registered\\.$")
	public void enter_country_Region_where_your_mobile_cell_phone_is_registered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobilecountrycode")).sendKeys("9850000000");
	}

	@Then("^Enter Date of birth$")
	public void enter_Date_of_birth() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Select drpDate = new Select(driver.findElement(By.id("birthday")));
		drpDate.selectByVisibleText("05");

	}

	@Given("^enter the login id (.*)$")
	public void enter_the_login_id(String loginId) {
		driver.findElement(By.name("membershipNumber")).sendKeys(loginId);
	}

	@When("^enter password for login (.*)$")
	public void enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("^click Login$")
	public void click_login() {
		driver.findElement(By
				.xpath("//button[@class='button small ivsg2-height-override btn-primary ng-binding ng-isolate-scope']"))
				.click();
	}

	@When("^check for (.*)$")
	public void check_for_the_Status(String status) {
		String title = driver.getTitle();
		if (title.contains("Executive Club")) {
			System.out.println("status should be" + status);
		} else {
			System.out.println("status should be" + status);
		}
	}

	@Given("^Click on Book$")
	public void click_on_Book() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
		Thread.sleep(1000);

	}

	@Given("^Click on Book a Flight$")
	public void click_on_Book_a_Flight() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Book a flight")).click();

	}

	@Given("^Click More Destinations under Europe$")
	public void click_More_Destinations_under_Europe() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(
				"//body[@id='threeColumnResp']/div[@id='bodyWrapper']/section[@id='baBody']/section[@id='page']/div[@class='large-10 medium-9 small-12 columns']/div[@class='row']/div[@id='pageContentMain']/section[@id='1483931534136']/article[2]/a[1] "))
				.click();
	}

	@Given("^Select One Way$")
	public void select_One_Way() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'one')]"));
		radioBtn.click();
	}

	@Given("^Select First Class$")
	public void select_First_Class(String arg1) throws Throwable {
		Select dropdown1 = new Select(driver.findElement(By.id("cabinFilter")));
		dropdown1.selectByVisibleText(arg1);

	}

	@Then("^Click Find Lowest Price$")
	public void click_Find_Lowest_Price() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@class='button btn-primary small-button translate']")).click();

	}

	@Then("^Click on Feedback image$")
	public void click_on_Feedback_image() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Button')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//html//body//img")).click();

	}

	@Then("^Click on site feedback image$")
	public void click_on_site_feedback_image() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='choice choice_general']")).click();

	}

	@Then("^Click on image$")
	public void click_on_image() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Enter text in Please tell us more \"([^\"]*)\"$")
	public void enter_text_in_Please_tell_us_more(String arg1) throws Throwable {
		driver.findElement(By.name("feedback")).sendKeys("This is Test");

	}

	@Then("^Click Done$")
	public void click_Done() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("submit")).click();

	}

	@Given("^Enter PAR and choose \"([^\"]*)\"$")
	public void enter_PAR_and_choose(String arg1) throws Throwable {
		driver.findElement(By.id("toFilter")).sendKeys("PAR");
		 
		 Thread.sleep(3000); List<WebElement> destinations =
		 driver.findElements(By.xpath("//ul[@id='destChoices']/ul/li"));
		 
		 System.out.println(destinations.size());
		 
		 for(int i=0 ; i<=destinations.size(); i++) {
		 if(destinations.get(i).getText().contains(arg1)) {
		 destinations.get(i).click();
		 break; 
		 }
		 }
	    
	}



	
	
	   
	}
