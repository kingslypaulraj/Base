package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setvalues()
	{
		excelFileNme = "DeleteLead";
		testCaseName = "TC003_DeleteLead";
		testDescription = "Deleting a lead";
		category = "sanity";
		author = "shanthi";
		iteration = "Leads";
	}

	@Test(dataProvider="fecthbook")
	public void DeleteLead(String fname, String ErrMsg) throws InterruptedException
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLead1()
		.EnterName(fname)
		.clickFindLeadButton()
		.clickOnFirstId()
		.clickDeleteButton()
		.clickFindLeadButton()
		.EnterName(fname)
		.clickFindLeadButton()
		.verifyErrorMsg(ErrMsg);



	}
}
