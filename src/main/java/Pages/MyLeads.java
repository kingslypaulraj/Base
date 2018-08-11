package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
    WebElement eleCreateLead;
	
	@FindBy(linkText="Find Leads")
	WebElement elefindLead;
	
	@FindBy(linkText="Merge Leads")
	WebElement eleClickMergeLead;
	

	public CreateLeads clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeads();
		}
	public FindLead clickFindLead() {
		click(elefindLead);
		return new FindLead();
		
	}
	
	public FindLeadForDelete clickFindLead1()
	{
		click(elefindLead);
		return new FindLeadForDelete();
	}
	
	
	public FindLeadForMerge clickMergeLead(){
		click(eleClickMergeLead);
		
		return new FindLeadForMerge();
	}
	
}

