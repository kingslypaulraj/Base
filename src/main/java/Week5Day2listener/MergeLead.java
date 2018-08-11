package Week5Day2listener;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MergeLead extends ProjectMethods{
	
	@Test
	public void MergeLead() throws InterruptedException 
	{
	
		WebElement leads = locateElement("xpath", "//a[contains(text(),'Leads')]");
		click(leads);
		WebElement mergeLead = locateElement("xpath", "//a[text() = 'Merge Leads']"); 
		click(mergeLead);
		WebElement partyIdFrom = locateElement("xpath", "//input[@id = 'partyIdFrom']//parent::td/a/img");
		click(partyIdFrom);
		
//		Thread.sleep(5000);
		switchToWindow(1);
		WebElement leadId = locateElement("xpath", 
				"//div[@class = 'x-tab-panel-body x-tab-panel-body-top']/div/div/div/div[1]/div/input[@type='text']");
		type(leadId, "10296");
		WebElement findLeadButton = locateElement("xpath", "//button[text() = 'Find Leads']");
		click(findLeadButton);
		Thread.sleep(5000);
		WebElement id = locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickNoSnap(id);
		switchToWindow(0);
		verifyTitle("Merge Leads | opentaps CRM");
		WebElement partyIdTo = locateElement("xpath", "//input[@id = 'partyIdTo']//parent::td/a/img");
		clickNoSnap(partyIdTo);
		switchToWindow(1);
		WebElement leadId2 = locateElement("xpath", 
				"//div[@class = 'x-tab-panel-body x-tab-panel-body-top']/div/div/div/div[1]/div/input[@type='text']");
		type(leadId2,"10919");
		WebElement findLeadButton1 = locateElement("xpath", "//button[text() = 'Find Leads']");
		click(findLeadButton1);
		Thread.sleep(5000);
		WebElement id2 = locateElement("xpath", "//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a[@class = 'linktext']");
		clickNoSnap(id2);
		switchToWindow(0);
		verifyTitle("Merge Leads | opentaps CRM");
//		WebElement locateElement = locateElement("xpath", "//table[@id = 'widget_ComboBox_partyIdTo']");
		WebElement mergeButton = locateElement("class", "buttonDangerous");
		clickNoSnap(mergeButton);
		acceptAlert();
		WebElement findLeads = locateElement("xpath", "//a[text() = 'Find Leads']");
		click(findLeads);
		WebElement findLeads2 = locateElement("xpath", "//div[@class = 'x-form-item x-tab-item']/div/input[@type = 'text']");
		type(findLeads2,"111111");
		WebElement clickFindLeads = locateElement("xpath", "//button[text() = 'Find Leads']");
		clickNoSnap(clickFindLeads);
		WebElement verifyPartial = locateElement("xpath", "//div[text()= 'No records to display']");
		verifyPartialText(verifyPartial,"No records to display");
	
		
		
//		
		
		
		
		
	}

}
