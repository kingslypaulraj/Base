package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_CreateLeadNeg extends  ProjectMethods{
	public String excelFileNme, testname, testDescription, category, author, moduleName;
	@BeforeTest
	public void setvalues()
	{
		excelFileNme = "CreateLead";
		testname = "Create Lead Error msg validate";
		testDescription = "Enter values";
		category = "sanity";
		author = "shanthi";
		moduleName = "leads";
	}
	@Test(dataProvider="fecthbook")
	public void createLead(String cname,String fname,String lname, String email, String mnum, String ErrorMsg
 ) throws InterruptedException {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.EntercompanyName(cname)
		.EnterFirstName(fname)
		.EnterLastName(lname)
		.EnterEmailId(email)
		.EnterPhNum(mnum)
		.clickSubmitbuttonFailure()
		.ErrorMsg(ErrorMsg)
		.clickSubmitbutton()
		.viewLeads(fname);
	}
	

}
