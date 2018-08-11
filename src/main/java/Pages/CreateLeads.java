package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{

	public CreateLeads()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
    WebElement eleCompanyName;
	
	@FindBy(id="createLeadForm_firstName")
    WebElement eleFName;
	
	@FindBy(id="createLeadForm_lastName")
    WebElement eleLName;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement eleMobileNum;
	
	@FindBy(id="createLeadForm_primaryEmail")
    WebElement eleEmailId;
	
	@FindBy(className="smallSubmit")
    WebElement eleSubmitBtn;
	
	@FindBy(className="errorList")
    WebElement eleErrorMsg;
	

	public CreateLeads EntercompanyName(String cname) {
		
		type(eleCompanyName,cname);
		return this;
		
	}

	public CreateLeads EnterFirstName(String fname) {
		
	type(eleFName,fname);
	return this;
		
	}
	public CreateLeads EnterLastName(String lname) {
		
		type(eleLName,lname);
		
		return this;
		
		}
public CreateLeads EnterPhNum(String mnum) {
		
		type(eleMobileNum,mnum);
		return this;
		
		}
	
	
public CreateLeads EnterEmailId(String email) {
		
		type(eleEmailId,email);
		return this;
		
		}
	public ViewLeads clickSubmitbutton()
	{
		click(eleSubmitBtn);
		return new ViewLeads();
	}
	
	public CreateLeads clickSubmitbuttonFailure()
	{
		click(eleSubmitBtn);
		return this;
	}
	public CreateLeads ErrorMsg(String expectedText)
	{
		verifyPartialText(eleErrorMsg, expectedText);
		return this;
	}

}


