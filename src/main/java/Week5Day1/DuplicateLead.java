package Week5Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class DuplicateLead extends ProjectMethods{

	@Test(groups= "Regression")
	public void duplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement createLead = locateElement("linktext","Create Lead");
		click(createLead);
		WebElement findLead = locateElement("linktext","Find Leads");
		click(findLead);
		WebElement emailClick = locateElement("xpath","//form[@method = 'POST']/div[@class = 'x-tab-panel']/div[@class = 'x-tab-panel-header x-unselectable']/div[@class = 'x-tab-strip-wrap']/ul[@class = 'x-tab-strip x-tab-strip-top']/li[3]");
		click(emailClick);
		WebElement emailId = locateElement("xpath","//label[text() = 'Email Address:']//parent::div/div/input[@type = 'text']");
		type(emailId, "shanti.2193@gmail.com");
		WebElement clickFindLead = locateElement("xpath","//button[text() = 'Find Leads']");
		click(clickFindLead);
		Thread.sleep(5000);
		WebElement fname = locateElement("xpath","//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext']");
		click(fname);
		WebElement ClickDuplicate = locateElement("xpath","//a[text() = 'Duplicate Lead']");
		click(ClickDuplicate);
		WebElement submit1 = locateElement("xpath","//input[@class = 'smallSubmit']");
		click(submit1);
		WebElement dublicateLead1Txt = locateElement("xpath","//a[text()= 'Duplicate Lead']");
		getText(dublicateLead1Txt);
		WebElement fnameVerify = locateElement("id","viewLead_firstName_sp");
		verifyExactText(fnameVerify, "Shanthi");
		
	}

}
