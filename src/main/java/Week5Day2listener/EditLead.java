package Week5Day2listener;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	@Test(dependsOnMethods= {"Week5Day1.CreateLead.createLead"})
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement createcnt = locateElement("linktext", "Create Contact");
		click(createcnt);
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