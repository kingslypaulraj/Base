package week5day2GenReport;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {

	@Test
	public void EditLead() throws InterruptedException {
		// TODO Auto-generated method stub
		startApp("chrome","http://leaftaps.com/opentaps/control/main");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePwd = locateElement("id","password");
		type(elePwd, "crmsfa");
		WebElement submit = locateElement("class","decorativeSubmit");
		click(submit);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
		WebElement createLead = locateElement("linktext","Create Lead");
		click(createLead);
		WebElement findLeads = locateElement("linktext","Find Leads");
		click(findLeads);
		WebElement firstName = locateElement("xpath","//label[text() = 'First name:']//parent::div[@class = 'x-form-item x-tab-item']/div[@class = 'x-form-element']/input[@type = 'text']");
		type(firstName,"Shanthi");
		WebElement findLeadBtn = locateElement("xpath","//button[contains(text(), 'Find Leads')]");
		click(findLeadBtn);
		Thread.sleep(5000);
		WebElement firstId = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext']");
		click(firstId);
		//	driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[contains(text(),'Shanthi')]").isDisplayed();
		WebElement edtBtn = locateElement("xpath","//a[text() = 'Edit']");
		click(edtBtn);
		WebElement updateCmpny = locateElement("id","updateLeadForm_companyName");
		clear(updateCmpny);
		WebElement cmpnyNm = locateElement("id","updateLeadForm_companyName");
		type(cmpnyNm,"Aspire Systems");
		WebElement submit1 = locateElement("xpath","//input[@type='submit']");
		click(submit1);
		WebElement firName  = locateElement("id","viewLead_firstNameLocal_sp");
		getText(firName);
		//	System.out.println("The first name is:" +fname);
		//	verifyTitle(expectedTitle)

	}





}
