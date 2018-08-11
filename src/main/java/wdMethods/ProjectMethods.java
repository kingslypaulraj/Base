package wdMethods;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import Week6day1.LearnExcel2;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods
{
	public String excelFileNme,testCaseName,testDescription,category,author,iteration;
	@BeforeSuite
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass
	public void beforeClass()
	{
		startTestModule(testCaseName, testDescription);
	}
	@Parameters({"browser","url","username","pwd"})
	@BeforeMethod
	public void login(String browser,String url,String username,String pwd)
	{
		startTestCase(iteration) ;
		startApp(browser,url);
		WebElement username1 = locateElement("id", "username");
		type(username1, username);
		WebElement password1 = locateElement("id", "password");
		type(password1, pwd);
		WebElement submit1 = locateElement("class", "decorativeSubmit");
		click(submit1);
		WebElement crm = locateElement("linktext", "CRM/SFA");
		click(crm);
	}
	@AfterMethod
	public void close()
	{
		closeAllBrowsers();
	}
	@AfterSuite
	public void stopsuit()
	{
		endResult();
	}	
	@DataProvider(name="fecthbook")
	public Object[][] getData() throws InterruptedException, IOException
	{
		LearnExcel2 excel = new LearnExcel2();
		return excel.getData(excelFileNme);
	}

}
