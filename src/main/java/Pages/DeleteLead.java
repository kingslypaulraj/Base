package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods {
	
	public DeleteLead()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "subMenuButtonDangerous")
	WebElement eleClickDeletebutton;
	
	
	public FindLead clickDeleteButton() {
		click(eleClickDeletebutton);
		return new FindLead();
		
	}
}

