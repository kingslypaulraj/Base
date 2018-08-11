package ImplementingFeature;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class EditLead extends SeMethods {

	public EditLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
