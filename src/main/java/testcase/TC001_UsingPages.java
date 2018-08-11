package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC001_UsingPages extends  ProjectMethods{
	public String excelFileNme, testCaseName, testDescription, category, author, moduleName;
	@BeforeTest
	public void setvalues()
	{
		excelFileNme = "CreateLead";
		testCaseName = "TC001_UsingPages";
		testDescription = "Creating a new lead";
		category = "sanity";
		author = "shanthi";
		iteration = "Leads";
	}
	@Test(dataProvider="fecthbook")
	public void createLead(String cname,String fname,String lname, String email, String mnum ) throws InterruptedException {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.EntercompanyName(cname)
		.EnterFirstName(fname)
		.EnterLastName(lname)
		.EnterEmailId(email)
		.EnterPhNum(mnum)
		.clickSubmitbutton()
		.viewLeads(fname);
		
		
	}
	

}
