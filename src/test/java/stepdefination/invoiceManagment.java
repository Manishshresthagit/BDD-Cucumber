package stepdefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class invoiceManagment {
	public static WebDriver driver;
	

@Given("^launch invoicemanager website\"([^\"]*)\"$")
public void launch_invoicemanager_website(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.gecko.driver", "C:/Eclipse/geckodriver.exe");
	driver = new FirefoxDriver();

	driver.get(arg1);
	driver.manage().window().maximize();
	Thread.sleep(8000);
}

@Then("^Enter Username\"([^\"]*)\"$")
public void enter_Username(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id ("inputEmail")).sendKeys("admin@gic.com");
}

@Then("^Enter Password\"([^\"]*)\"$")
public void enter_Password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.id ("inputPassword")).sendKeys("Admin123");
     }

@Then("^Click on Login$")
public void click_on_Login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
}

@Then("^User must be able to Login Accountmanager page Dashboard$")
public void user_must_be_able_to_Login_Accountmanager_page_Dashboard() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.navigate().to("http://3.13.126.58/AMS3.0/");
}

@Then("^Click on calander$")
public void click_on_calander() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement( By.xpath("//a[contains(text(),'Calendar')]")).click();
}




@Then("^Click on Month$")
public void click_on_Month() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement btn11=driver.findElement(By.xpath("//button[@class='fc-month-button fc-button fc-state-default fc-corn"));
	btn11.click();
    
}

@Then("^Click on week$")
public void click_on_week() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btn12=driver.findElement(By.className("fc-agendaWeek-button fc-button fc-state-default"));
   btn12.click();
}

@Then("^Click on > sign$")
public void click_on_sign() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btn13=driver.findElement(By.className("fc-icon fc-icon-right-single-arrow"));
   btn13.click();
   
	}

@Then("^Click on Today$")
public void click_on_Today() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement btn14=driver.findElement(By.xpath("//button[@class='fc-month-button fc-button fc-state-default fc-corner"));
    btn14.click();

}


@Then("^Click on day$")
public void click_on_day() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[@class='fc-agendaWeek-button fc-button fc-state-default fc")).click();
}

@Then("^Click on Users$")
public void click_on_Users() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.className("mm_auth")).click();
}

@Then("^Click on List users$")
public void click_on_List_users() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("auth_users")).click();
}

@Then("^Click on search textbox$")
public void click_on_search_textbox() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("manishbshrestha@hotmail.co.uk");
}
	
	@Then("^Click on Add new user$")
	public void click_on_Add_new_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement Btn =driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		  Btn.click();
	}
	
@Then("^Enter first name$")
public void enter_first_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("first_name")).sendKeys("manish");
}

@Then("^Enter Last name$")
public void enter_Last_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("last_name")).sendKeys("shrestha");
}

@Then("^Enter company$")
public void enter_company() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("company")).sendKeys("ERP TRAINING");
}

@Then("^Enter phone number$")
public void enter_phone_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("phone")).sendKeys("02098798797");
}

@Then("^Enter Email address$")
public void enter_Email_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("email")).sendKeys("abcdef@hotmail.com");
}

@Then("^Select sales staff$")
public void select_sales_staff() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement Btn= driver.findElement(By.id("optionsRadios2"));
    Btn.click();
}

@Then("^create password$")
public void create_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("password")).sendKeys("manish123");
}

@Then("^Confirm Passowrd$")
public void confirm_Passowrd() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("password_confirm")).sendKeys("manish123");
}

@Then("^Click on Add user$")
public void click_on_Add_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement Btn =driver.findElement(By.xpath("//input[@name='submit']"));
    Btn.click();
}



@Then("^Click on List Product$")
public void click_on_List_Product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("products_index")).click();
}


@Then("^Click on Add Product$")
public void click_on_Add_Product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement Btn1=driver.findElement (By.className("btn btn-primary"));
   Btn1.click();
   
}



@Then("^Click on Excel$")
public void click_on_Excel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement Btn3=driver.findElement(By.xpath("/span[contains(text(),'Excel')]"));
	Btn3.click();
}

@Then("^Click on PDF$")
public void click_on_PDF() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement Btn4=driver.findElement(By.xpath("//span[contains(text(),'PDF')]"));
	Btn4.click();
};


@Then("^Click on CSV$")
public void click_on_CSV() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement Btn5=driver.findElement(By.xpath("//span[contains(text(),'CSV')]"));
	Btn5.click();
}

@Then("^Click on Columns$")
public void click_on_Columns() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement Btn6=driver.findElement(By.xpath("//span[contains(text(),'Columns')]"));
	Btn6.click();

}
@Then("^Click on Products$")
public void click_on_Products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.className("mm_products")).click();
}

@Then("^Click on List Products$")
public void click_on_List_Products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("products_index")).click();
}

@Then("^Click on dropdown$")
public void click_on_dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  WebElement drpdwn= driver.findElement(By.xpath("//select[@name='fileData_length']"));
  drpdwn.click();
}

@Then("^Select (\\d+)$")
public void select(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Select selectByIndex= new Select(driver.findElement(By.xpath("//select[@name='fileData_length']")));
	selectByIndex.selectByIndex(1);
	Thread.sleep(5000);
}

@Then("^Select all$")
public void select_all() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Select selectByIndex= new Select(driver.findElement(By.xpath("//select[@name='fileData_length']")));
	selectByIndex.selectByIndex(4);
	Thread.sleep(5000);;
    
}


@Then("^Click on Product$")
public void click_on_Product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@class='mm_products']")).click();
}

@Then("^click on List Product$")
public void click_on_List_Product1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@id='products_index']")).click();
}

@Then("^click on Add user$")
public void click_on_Add_user1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath ("//a[@class='btn btn-primary']")).click();
}

@Then("^Enter First Name$")
public void enter_First_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("name")).sendKeys("ClassicHouse");
}

@Then("^Enter Details$")
public void enter_Details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("details")).sendKeys("This is very very good testing");
}

@Then("^Enter price$")
public void enter_price() throws Throwable {
   driver.findElement(By.id("price")).sendKeys("23232");
}

@Then("^Click on Add product$")
public void click_on_Add_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//input[@name='submit']")).click();
}



@Then("^Click on add product$")
public void click_on_add_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@id='products_add']")).click();
}

@Then("^Enter name$")
public void enter_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ERP");
}

@Then("^Enter details$")
public void enter_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//textarea[@id='details']")).sendKeys("this is erp");
}

@Then("^Enter phone$")
public void enter_phone() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("price")).sendKeys("080868686");
}

@Then("^click Add product$")
public void click_Add_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
driver.findElement(By.xpath("//input[@name='submit']")).click();
}

@Then("^Click on User$")
public void click_on_User() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@class='mm_auth']")).click();
}

@Then("^Click on List user$")
public void click_on_List_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@id='auth_users']")).click();
}

@Then("^Click on products$")
public void click_on_products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[@class='mm_products']")).click();
}

@Then("^Click on List products$")
public void click_on_List_products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//a[@id='products_index']")).click();
}

@Then("^Click on page (\\d+)$")
public void click_on_page(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  WebElement btn7=  driver.findElement(By.className("paginate_button "));
  btn7.click();
}
@Then("^Click on Next$")
public void click_on_Next() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btn8= driver.findElement(By.xpath("//li[@id='fileData_next']//a[contains(text(),'Next')]"));
   btn8.click();
}

@Then("^Click on previous$")
public void click_on_previous() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btn9=driver.findElement(By.xpath("//li[@id='fileData_previous']//a[contains(text(),'Previous')]"));
   btn9.click();
}

@Then("^Click sales$")
public void click_sales() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.className("mm_sales")).click();
}

@Then("^Click add invoce$")
public void click_add_invoce() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("sales_add")).click();
}

@Then("^Click on company$")
public void click_on_company() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//span[contains(text(),'Select Customer')]")).click();
	}


@Then("^Select Santhos \\(Shan\\)$")
public void select_Santhos_Shan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Select selectByVisibleText= new Select(driver.findElement(By.xpath("//div[@id='customer_chosen']//input")));
	selectByVisibleText.selectByVisibleText("Test (ABC)");
	Thread.sleep(5000);
}

@Then("^Enter Order Disocunt$")
public void enter_Order_Disocunt() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("order_discount")).sendKeys("1200");
}

@Then("^Select Recurring$")
public void select_Recurring() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//div[@id='recurring_chosen']//a[@class='chosen-single']")).click();
}

@Then("^Billing company$")
public void billing_company() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//span[contains(text(),'My Company Name')]")).click();
}

@Then("^Enter Due Date$")
public void enter_Due_Date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("due_date")).click();
}

@Then("^Select order tax$")
public void select_order_tax() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/span[contains(text(),'No Tax')]")).click();
}

@Then("^Select Reference number$")
public void select_Reference_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("gen_ref")).click();
}

@Then("^Enter Shipping$")
public void enter_Shipping() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("shipping")).sendKeys("LONDON TO NEPAL");
}

@Then("^Select Status$")
public void select_Status() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//span[contains(text(),'Select Status')]")).click();
}

@Then("^Enter Quantity$")
public void enter_Quantity() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("quantity-1")).sendKeys("20");
}

@Then("^Enter Production$")
public void enter_Production() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.id("product-1")).sendKeys("This Product is very Good");
}

@Then("^Enter unit price$")
public void enter_unit_price() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("price-1")).sendKeys("10");
}

@Then("^Click Add invoice$")
public void click_Add_invoice() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btnadd=driver.findElement(By.xpath("//input[@name='submit']"));
   btnadd.click();
}

@Then("^click on product$")
public void click_on_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[@class='mm_products']")).click();
}

@Then("^Click on list product$")
public void click_on_list_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("products_index")).click();
}

@Then("^click on copy$")
public void click_on_copy() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement btn1=driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
    btn1.click();
}

@Then("^click on Excel$")
public void click_on_Excel1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement btnn=driver.findElement(By.xpath("//span[contains(text(),'Excel')]"));
    btnn.click();
    
}

 

@Then("^click on csv$")
public void click_on_csv() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement btnnn=driver.findElement(By.xpath("//span[contains(text(),'CSV')]"));
   btnnn.click();
}

@Then("^click on pdf$")
public void click_on_pdf() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement bbtn=driver.findElement(By.xpath("//span[contains(text(),'PDF')]"));
    bbtn.click();
}




@Then("^Click on page number$")
public void click_on_page_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement Button1=driver.findElement(By.xpath("//div[@class='col-md-6 pr0']//li[3]//a[1]"));
    Button1.click();
}

@Then("^click on Next$")
public void click_on_Next1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement Button2=driver.findElement(By.xpath("//li[@id='fileData_next']//a[contains(text(),'Next')]"));
    Button2.click();
}

@Then("^click on previous$")
public void click_on_previous1() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement Button3=driver.findElement(By.xpath("//li[@id='fileData_previous']//a[contains(text(),'Previous')]"));
    Button3.click();
}



@Then("^Click on addproduct$")
public void click_on_addproduct() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebElement button4=driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
    button4.click();
}

@Then("^Enter Name$")
public void enter_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("name")).sendKeys("Johnson and Johnson");
}

@Then("^Enter Detail$")
public void enter_Detail() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("details")).sendKeys("This is very good poduct");
}

@Then("^Price$")
public void price() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("price")).sendKeys("345");
}

@Then("^Click Add Product$")
public void click_Add_Product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 WebElement button5=driver.findElement(By.xpath("//input[@name='submit']"));
 button5.click();
}

@Then("^click on name$")
public void click_on_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//th[@class='col-xs-2 sorting_asc']")).click();
	Thread.sleep(5000);
}

@Then("^click on Details$")
public void click_on_Details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//th[@class='sorting_desc']")).click();
	Thread.sleep(5000);
}

@Then("^click price$")
public void click_price() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//th[contains(text(),'Price')]")).click();
	Thread.sleep(5000);
}

@Then("^click Tax price$")
public void click_Tax_price() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//th[@class='col-xs-1 sorting_asc']")).click();
	Thread.sleep(5000);
}
@Then("^Click on edit$")
public void click_on_edit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   WebElement button12= driver.findElement(By.className("fa fa-edit"));
   button12.click();
}
}


