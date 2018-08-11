package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods{

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="viewLead_firstName_sp")
    WebElement eleViewLeads;

	public void viewLeads(String expectedText) {
		
		verifyExactText(eleViewLeads, expectedText);
		
	}

}
