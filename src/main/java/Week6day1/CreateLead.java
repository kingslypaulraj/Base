package Week6day1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	private String excelFileNme, testname, testDescription, category, author, moduleName;
	@BeforeTest
	public void setvalues()
	{
		excelFileNme = "CreateLead";
		testname = "Create a lead";
		testDescription = "Creating a new lead";
		category = "sanity";
		author = "shanthi";
		moduleName = "leads";
	}
	@Test(dataProvider="fecthbook")
	public void createLead(String cname,String fname,String lname ) throws InterruptedException {
		WebElement createLead = locateElement("linktext", "Create Lead");
		click(createLead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, cname);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, fname);
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, lname);
		WebElement submit2 = locateElement("class", "smallSubmit");
		click(submit2);
		WebElement firstname1 = locateElement("id","viewLead_firstName_sp");
		verifyExactText(firstname1, "shanthi");
	}

}