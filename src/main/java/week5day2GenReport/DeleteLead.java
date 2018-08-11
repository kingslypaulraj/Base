package week5day2GenReport;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

	@Test
	public void deleteLead() throws InterruptedException {
		
	startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePwd = locateElement("id","password");
	type(elePwd, "crmsfa");
	WebElement submit = locateElement("class","decorativeSubmit");
	click(submit);
	WebElement crmsfa = locateElement("linktext","CRM/SFA");
	click(crmsfa);
	WebElement createLead = locateElement("linktext", "Create Lead");
	click(createLead);
	WebElement findLeads = locateElement("linktext", "Find Leads");
	click(findLeads);
	Thread.sleep(5000);
	WebElement phone = locateElement("xpath", "//form[@method = 'POST']/div[@class = 'x-tab-panel']/div[@class = 'x-tab-panel-header x-unselectable']/div[@class = 'x-tab-strip-wrap']/ul[@class = 'x-tab-strip x-tab-strip-top']/li[2]");
	click(phone);
	WebElement phoneNum = locateElement("xpath", "//td[@class = 'x-table-layout-cell']/div/div/div/input[@name = 'phoneNumber']");
	type(phoneNum,"8754388065");
	WebElement findLeadsBtn = locateElement("xpath", "//button[contains(text(), 'Find Leads')]");
	click(findLeadsBtn);
	Thread.sleep(5000);
	WebElement firstResult = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext']");
	click(firstResult);
	WebElement deleteBtn = locateElement("xpath", "//a[text() = 'Delete']");
	click(deleteBtn);
	WebElement findLeads2 = locateElement("linktext", "Find Leads");
	click(findLeads2);
	WebElement id = locateElement("xpath", "//label[text() = 'Lead ID:']//parent::div/div/input[@type = 'text']");
	type(id,"10405");
	Thread.sleep(5000);
	WebElement findlead3 = locateElement("xpath", "//button[contains(text(), 'Find Leads')]");
	click(findlead3);
	closeBrowser();
	}

}
