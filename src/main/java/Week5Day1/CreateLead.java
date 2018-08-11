package Week5Day1;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class CreateLead extends ProjectMethods {

	@Test(groups= "Smoke")
	public void createLead() throws InterruptedException {
		
		WebElement createLead = locateElement("linktext", "Create Lead");
		click(createLead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, "Accenture");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, "Shanthi");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, "Rajndran");
		WebElement dataSourceId = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(dataSourceId, "Employee");
		WebElement firstNameLocal = locateElement("id","createLeadForm_firstNameLocal");
		type(firstNameLocal, "Shanthi");
		WebElement personalTitle = locateElement("id","createLeadForm_personalTitle");
		type(personalTitle, "Miss");
		WebElement profTitle = locateElement("id","createLeadForm_generalProfTitle");
		type(profTitle, "Selenium");
		WebElement revenue = locateElement("id","createLeadForm_annualRevenue");
		type(revenue, "30 Million");
		WebElement industry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(industry, "Insurance");
		WebElement owner = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingText(owner, "Partnership");
		owner.sendKeys(Keys.TAB);
//		getText(ele)
		WebElement sicCode = locateElement("id","createLeadForm_sicCode");
		type(sicCode, "5541");
		WebElement description = locateElement("id","createLeadForm_description");
		type(description, "This is an institute for Selenium training");
		WebElement impNote = locateElement("id","createLeadForm_importantNote");
		type(impNote, "We are giving our best");
		WebElement phoneAreaCode = locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(phoneAreaCode, "0421");
		WebElement phoneExtension = locateElement("id","createLeadForm_primaryPhoneExtension");
		type(phoneExtension, "0421");
		WebElement emailId = locateElement("id","createLeadForm_primaryEmail");
		type(emailId, "shanti.2193@gmail.com");
		WebElement genName = locateElement("id","createLeadForm_generalToName");
		type(genName, "Shanthi");
		WebElement address1 = locateElement("id","createLeadForm_generalAddress1");
		type(address1, "157");
		WebElement city = locateElement("id","createLeadForm_generalCity");
		type(city, "Tiruppur");
		WebElement postCode = locateElement("id","createLeadForm_generalPostalCode");
		type(postCode, "641652");
		WebElement postCodeExt = locateElement("id","createLeadForm_generalPostalCodeExt");
		type(postCodeExt,"641652");
		WebElement cmpgn = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingText(cmpgn, "9000");
		cmpgn.sendKeys(Keys.TAB);
		WebElement lastNameLocal = locateElement("id","createLeadForm_lastNameLocal");
		type(lastNameLocal,"Rajendran");
		WebElement dob = locateElement("id","createLeadForm_birthDate");
		type(dob,"12/21/93");
		WebElement dept = locateElement("id","createLeadForm_departmentName");
		type(dept,"Testing");
		WebElement crncy = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(crncy, "INR");
		crncy.sendKeys(Keys.TAB);
		WebElement noOfEmp = locateElement("id","createLeadForm_numberEmployees");
		type(noOfEmp,"12/21/15");
		WebElement ticketSymbol = locateElement("id","createLeadForm_tickerSymbol");
		type(ticketSymbol,"123");
		WebElement primPhoneNum = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(primPhoneNum,"8754388065");
		WebElement askFor = locateElement("id","createLeadForm_primaryPhoneAskForName");
		type(askFor,"Shanthi");
		WebElement webUrl = locateElement("id","createLeadForm_primaryWebUrl");
		type(webUrl,"www.abc.com");
		WebElement attnName = locateElement("id","createLeadForm_generalAttnName");
		type(webUrl,"Shanthi");
		WebElement address2 = locateElement("id","createLeadForm_generalAddress2");
		type(address2,"Nehru nagar 1st Street");
		WebElement country = locateElement("id","createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");
		Thread.sleep(5000);
		WebElement state = locateElement("id","createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "TAMILNADU");
		WebElement submit2 = locateElement("class", "smallSubmit");
		click(submit2);
		WebElement firstname1 = locateElement("id","viewLead_firstName_sp");
		verifyExactText(firstname1, "shanthi");
	
		}
}
