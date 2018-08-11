package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {

	@BeforeTest
	public void setvalues()
	{
		excelFileNme = "EditLead";
		testCaseName = "Edit Lead";
		testDescription = "Editing a new lead";
		category = "sanity";
		author = "shanthi";
		iteration = "Leads";
	}
	
	
	@Test(dataProvider="fecthbook")
	public void editLead(String fname,String cname) throws InterruptedException
	{
	
	new MyHomePage()
	.clickLeads()
	.clickFindLead()
	.EnterName(fname)
	.clickFindLeadButton()
	.clickOnFirstId()
	.clickEditButton()
	.editingCompanyNm(cname)
	.clickUpdateButton();
	
	}
}
