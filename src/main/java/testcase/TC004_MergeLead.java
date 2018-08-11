package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.ClickOnFromLeadIcon;
import Pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods{

	@BeforeTest
		public void setvalues()
		{
			excelFileNme = "MergeLead";
			testCaseName = "TC004_MergeLead";
			testDescription = "Deleting a lead";
			category = "sanity";
			author = "shanthi";
			iteration = "Leads";
		}
	@Test(dataProvider="fecthbook")
	public void MergeLead(String fname,String TName)throws InterruptedException
		{
		new MyHomePage()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadIcon()
		.enterLeadId(fname)
		.clickOnFindLead();
		
		
			
			
			
			
			
			
			
			

	}

}
