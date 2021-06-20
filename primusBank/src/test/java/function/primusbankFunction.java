package function;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class primusbankFunction {

	
public static WebDriver driver;
	
	@Given("^I open browser with url \"([^\"]*)\"$")
	public void launchApp(String url) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);			
	}
	
	
	
	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
	    
		driver.findElement(By.id("txtuId")).isDisplayed();
	   // throw new PendingException();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		driver.findElement(By.id("txtuId")).sendKeys(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("txtPword")).sendKeys(arg1);
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@Then("^I should see admin module$")
	public void i_should_see_admin_module() throws Throwable {
	   String vlid= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	 if(vlid=="Welcome to Admin ") {
		 System.out.println("Admin login successfullt done");
	 }
	}

	@When("^i click logout$")
	public void i_click_logout() throws Throwable {
		driver.findElement(By.xpath("//a[@href='http://primusbank.qedgetech.com']")).click();
	}

	@When("^I close browser$")
	public void i_close_browser() throws Throwable {
	  driver.close();
	}
	
	@Then("^I should see massage$")
	public void i_should_see_massage() throws Throwable {
	   driver.switchTo().alert().accept();
	}
	
	//@When("^I select user branch \"([^\"]*)\"$")
	//public void I select user branch(String arg1) throws Throwable {
	//WebElement vxv = driver.findElement(By.id("drlist"));
	//Select select= new Select(vxv);
	//select.selectByValue(arg1);
	
	//}
	
	
	@When("^I select user branch \"([^\"]*)\"$")
	public void i_select_user_branch(String arg1) throws Throwable {
		WebElement vxv = driver.findElement(By.id("drlist"));
		Select select= new Select(vxv);
		select.selectByValue(arg1);
	}
	
	@When("^I select branches$")
	public void i_select_branches() throws Throwable {
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	}   

	@When("^I select new branch$")
	public void i_select_new_branch() throws Throwable {
		 driver.findElement(By.id("BtnNewBR")).click();
	}  

	@When("^I entered input in textboxes and click submit \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_entered_input_in_textboxes_and_click_submit(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	   driver.findElement(By.id("txtbName")).sendKeys(arg1);
	   driver.findElement(By.id("txtAdd1")).sendKeys(arg2);      
	   WebElement city = driver.findElement(By.id("lst_cityI"));
		Select selectc= new Select(city);
		selectc.selectByIndex(0);
	   
	   WebElement state = driver.findElement(By.id("lst_stateI"));
		Select selects= new Select(state);
		selects.selectByIndex(0);
			
		WebElement country = driver.findElement(By.id("lst_counrtyU"));
		Select selectcr= new Select(country);
		selectcr.selectByValue(arg5);	
		
		driver.findElement(By.id("txtZip")).sendKeys(arg4); 
		
		driver.findElement(By.id("btn_insert")).click();
		
	}
	
	@When("^I select role$")
	public void i_select_role() throws Throwable {
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	}

	@When("^I select new role$")
	public void i_select_new_role() throws Throwable {
	    driver.findElement(By.id("btnRoles")).click();
	}

	@When("^I entered input in textboxes and click submit of role \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_entered_input_in_textboxes_and_click_submit_of_role(String arg1, String arg2, String arg3) throws Throwable {
	   driver.findElement(By.id("txtRname")).sendKeys(arg1);
	   driver.findElement(By.id("txtRDesc")).sendKeys(arg2);
	   WebElement roltype = driver.findElement(By.id("lstRtypeN"));
	   Select selectcr= new Select(roltype);
		selectcr.selectByValue(arg3);	
		driver.findElement(By.id("btninsert")).click();
	}

	
}
