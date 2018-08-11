package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() {

		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrm = locateElement("linktext","CRM/SFA");
		click(eleCrm);
		if(verifyTitle("Create Lead | opentaps CRM") == true)
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not matching");
		}
		WebElement eleCreateLead = locateElement("linktext","Create Lead");
		click(eleCreateLead);
		WebElement eleCmpNm = locateElement("class","inputBox");
		type(eleCmpNm,"Accenture");
		WebElement eleNm = locateElement("id", "createLeadForm_firstName");
		type(eleNm,"Shanthi");
		WebElement eleLastNm = locateElement("id", "createLeadForm_lastName");
		type(eleLastNm, "Rajendran");
		WebElement source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Employee");
		WebElement industry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingValue(industry, "IND_DISTRIBUTION");
		WebElement eleSub = locateElement("name","submitButton");
		click(eleSub);

		
		
		
	}


}






