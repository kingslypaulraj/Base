package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class FindLeadForMerge extends ProjectMethods {
	
	public FindLeadForMerge()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='partyIdFrom']//parent::td/a/img")
	WebElement eleClickFromLeadIcon;
	
//	@FindBy(xpath="//label[text()='Lead ID:']//parent::div/div/input")
//	WebElement eleFindLead;//type 10032
//	
//	@FindBy(xpath="//button[text()='Find Leads']")
//	WebElement eleClickFindLead;
//	
//	@FindBy(xpath="//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']")
//	WebElement eleclickFirstPartyId;
//	
//	@FindBy(xpath="(//td[@class = 'dijitReset dijitStretch dijitComboBoxInput'])[2]")
//	WebElement eleClickToLead;
//	
//	@FindBy(xpath="//label[text()='Lead ID:']//parent::div/div/input")
//	WebElement eleFindLeadFor2;//type 10037
//	
//	@FindBy(xpath="//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']")
//	WebElement eleclick2ndPartyId;
//	
//	@FindBy(className="buttonDangerous")
//	WebElement eleClickMerge;
	
	public ClickOnFromLeadIcon clickFromLeadIcon() throws InterruptedException
	{
		Thread.sleep(3000);
		click(eleClickFromLeadIcon);
		return new ClickOnFromLeadIcon();
	}
}
