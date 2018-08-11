package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead()
	{
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath="(//a[@class = 'subMenuButton'])[3]")
	WebElement eleClickingEditButton;
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleEditingCmpnyNm;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement eleClickUpdateButton;
	


	public EditLead clickEditButton()
	{
	click(eleClickingEditButton);
	return this;
	}
	


	public EditLead editingCompanyNm(String cname)
	{
		clear(eleEditingCmpnyNm);
		type(eleEditingCmpnyNm, cname);
		return this;
	}
	
	public EditLead clickUpdateButton()
	{
		click(eleClickUpdateButton);
		return this;
	}
}