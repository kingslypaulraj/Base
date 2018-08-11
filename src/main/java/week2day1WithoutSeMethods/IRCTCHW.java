package week2day1WithoutSeMethods;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver ir = new ChromeDriver();
		ir.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
//		ir.findElementById("userRegistrationForm:userName").sendKeys("shanthi");
//		ir.findElementById("userRegistrationForm:password").sendKeys("6Shanth!");
//		ir.findElementById("userRegistrationForm:confpasword").sendKeys("6Shanth!");
		WebElement Security_Question = ir.findElementById("userRegistrationForm:securityQ");
		Select bb  = new Select(Security_Question);
		bb.selectByValue("1");
		ir.findElementById("userRegistrationForm:securityAnswer").sendKeys("Cat");
		WebElement Preferred_Language = ir.findElementById("userRegistrationForm:prelan");
		bb.selectByValue("1");
		ir.findElementById("userRegistrationForm:firstName").sendKeys("Shanthi");
		WebElement Gender = ir.findElementById("userRegistrationForm:gender:1");
		Gender.click();
		bb.selectByValue("1");
		WebElement Marital = ir.findElementById("userRegistrationForm:maritalStatus:1");
		Marital.click();
		bb.selectByValue("1");
//		WebElement dateOfBirth=ir.findElementById("userRegistrationForm:dobDay");
//		Select selectDate=new Select(dateOfBirth);
//		List<WebElement> allDates=selectDate.getOptions();
//		selectDate.selectByVisibleText("10");
//		dateOfBirth.sendKeys(Keys.TAB);
//		
//		WebElement selectMonth = ir.findElementById("");
//		Select month = new Select(selectMonth);
//		List<WebElement> allMonth = month.getOptions();
//		month.selectByVisibleText("Dec");
//		selectMonth.sendKeys(Keys.TAB);
//		
//		WebElement year = ir.findElementById("");
//		Select years = new Select(year);
//		List<WebElement> allYears = years.getOptions();
//		month.selectByVisibleText("");
//		year.sendKeys(Keys.TAB);
		

		WebElement occupation = ir.findElementById("userRegistrationForm:occupation");
		Select occupations = new Select(occupation);
		occupations.selectByVisibleText("Private");

		WebElement country = ir.findElementById("userRegistrationForm:countries");
		Select countries = new Select(country);
		countries.selectByVisibleText("India");
		ir.findElementById("userRegistrationForm:email").sendKeys("shanti.2193@gmail.com");
		ir.findElementById("userRegistrationForm:mobile").sendKeys("8754388065");
		
		WebElement nationality = ir.findElementById("userRegistrationForm:nationalityId");
		Select nation = new Select(nationality);
		nation.selectByVisibleText("India");
		ir.findElementById("userRegistrationForm:address").sendKeys("157");
		ir.findElementById("userRegistrationForm:pincode").sendKeys("641652");
		WebElement state = ir.findElementById("userRegistrationForm:statesName");
		String stateOfMine = state.getText();
		//stateOfMine.selectByVisibleText("Tamil Nadu");
		WebElement city = ir.findElementById("userRegistrationForm:cityName");
		String cityTown = city.getText();
		
	}
	
	
	

}
