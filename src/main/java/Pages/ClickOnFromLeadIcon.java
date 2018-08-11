package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ClickOnFromLeadIcon extends ProjectMethods{
	
	public ClickOnFromLeadIcon()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//label[text()='Lead ID:']//parent::div/div/input")
	WebElement eleFindLead;//type 10032
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleClickFindLead;
	
	public ClickOnFromLeadIcon enterLeadId(String fname)
	{
		switchToWindow(1);
		type(eleFindLead, fname);
		return this;
	}
	
	public ClickOnFromLeadIcon clickOnFindLead() throws InterruptedException {
		click(eleClickFindLead);
		Thread.sleep(3000);
		return this;
	}
}
