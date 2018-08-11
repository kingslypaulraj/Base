package ImplementingFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	public RemoteWebDriver driver;
	@Given("Open the brower")
	public void lunchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}

	@And("Maximize the window")
	public void maxWindow()
	{
		driver.manage().window().maximize();
	}

	@And("Load the URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set the Timeout")
	public void setTimeout()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@And("Enter the username as (.*)")
	public void enterUName(String uname)
	{
		driver.findElementById("username").sendKeys(uname);
	}

	@And("Enter the Password as (.*)")
	public void enterPwd(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click On the Login Button")
	public void clickLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify login")
	public void verifyLogin()
	{
		System.out.println("Loggedin Successfully");
	}

	@When("Select CRM SFA")
	public void selectingCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Then("Click on Create Lead")
	public void clickOnCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter Company Name (.*)")
	public void EnterCName(String compname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
			}
	@And("Enter First Name")
	public void FName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Shanthi");
	}
	@And("Enter Last Name")
	public void LName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajendran");
	}
	@When("Click on Creat Lead")
	public void clickCreteLead()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
@Then("browser close")
public void closeBrowser()
{
	driver.close();
}

}
