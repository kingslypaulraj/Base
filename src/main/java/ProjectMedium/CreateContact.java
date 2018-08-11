package ProjectMedium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
public class CreateContact extends ProjectMethods {
	@Test(groups = {"common"})
	public void createContact() throws InterruptedException {

		WebElement createcnt = locateElement("linktext", "Create Contact");
		click(createcnt);
		WebElement firstname = locateElement("xpath", "//input[@id = 'firstNameField']");
		type(firstname,"Kings");
		WebElement lastname = locateElement("xpath","//input[@id = 'lastNameField']");
		type(lastname,"Paulraj");
		WebElement nameloc = locateElement("id","createContactForm_firstNameLocal");
		type(nameloc,"Kingsly");
		WebElement lastlocal = locateElement("id","createContactForm_lastNameLocal");
		type(lastlocal,"Paulraj");
		WebElement per = locateElement("id","createContactForm_personalTitle");
		type(per,"Mr");
		WebElement con = locateElement("id","createContactForm_generalProfTitle");
		type(con,"Indian");
		WebElement dep = locateElement("id","createContactForm_departmentName");
		type(dep,"Testing");
		WebElement crncy = locateElement("id", "createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(crncy, "INR");
		WebElement des = locateElement("id","createContactForm_description");
		type(des,"Working as a software tester");
		WebElement not = locateElement("id","createContactForm_importantNote");
		type(not,"Working as a software tester");
		WebElement code = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(code,"+91");
		WebElement extn = locateElement("id","createContactForm_primaryPhoneExtension");
		type(extn,"0421");
		WebElement email = locateElement("id","createContactForm_primaryEmail");
		type(email,"kingsly.paulraj@gmail.com");
		WebElement phone = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phone,"9876543211");
		WebElement pname = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(pname,"Kingsly");
		WebElement nfield = locateElement("xpath","//input[@id = 'generalToNameField']");
		type(nfield,"Kingsly");
		WebElement add = locateElement("id","createContactForm_generalAddress1");
		type(add,"Perumal kovil street");
		WebElement city = locateElement("id","createContactForm_generalCity");
		type(city,"chennai");
		WebElement postalc = locateElement("xpath","//input[@id = 'createContactForm_generalPostalCode']");
		type(postalc,"600100");
		WebElement codeE = locateElement("id","createContactForm_generalPostalCodeExt");
		type(codeE,"01");
		WebElement atname = locateElement("id","createContactForm_generalAttnName");
		type(atname,"Kings");
		WebElement add2 = locateElement("id","createContactForm_generalAddress2");
		type(add2,"pallikarnai");
		WebElement conid = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(conid, "IND");
		Thread.sleep(5000);
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "IN-TN");
		WebElement save = locateElement("class","smallSubmit");
		click(save);
		WebElement firstname1 = locateElement("id","viewContact_firstName_sp");
		verifyExactText(firstname1, "Kings");
		}
	}
//		