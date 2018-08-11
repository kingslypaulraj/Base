package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadForDelete extends ProjectMethods{
	
	public FindLeadForDelete()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[text()='First name:'])[3]//parent::div/div/input")
	WebElement elefindLead;
	
	@FindBy(xpath="//button[contains(text(), 'Find Leads')]")
	WebElement eleClickFindLead;
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext']")
	WebElement eleFirstId;
	
	
	public FindLeadForDelete EnterName(String fname) throws InterruptedException {
		click(elefindLead);
		type(elefindLead, fname);
		Thread.sleep(2000);
		return this;
		
	}
	
	public FindLeadForDelete clickFindLeadButton() throws InterruptedException
	{
		click(eleClickFindLead);
		Thread.sleep(2000);
		return this;
	}

	
	
	public  DeleteLead clickOnFirstId()
	{
		click(eleFirstId);
		return new DeleteLead();
	}

}



