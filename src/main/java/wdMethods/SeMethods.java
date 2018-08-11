package wdMethods;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporter;

public class SeMethods extends Reporter implements WdMethods {
	public static RemoteWebDriver driver;
	int i=1;
	public  void startApp(String browser, String url) throws NullPointerException {
		try 
		{
			if (browser.equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
						driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is Launched Successfully");
			reportStep("The Browser "+browser+" is Launched Successfully", "pass");
			
		} 
		catch (WebDriverException e) 
		{
		System.err.println("Driver Exception Handled");
			reportStep("Driver Exception Handled", "fail");
			//throw new RuntimeException();
		}
		catch (Exception e)
		{
			System.err.println("Exception handled");
			reportStep("Exception handled", "fail");
		//	throw new RuntimeException();
		}
		finally 
		{
			takeSnap();
		}

	}

	//	public abstract void login (String r1);
	//	{
	//		WebElement r1 = locateElement("", "");
	//	}
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "name": return driver.findElementByName(locValue);
			case "tagname": return driver.findElementByTagName(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "cssselector": return driver.findElementByCssSelector(locValue);
			case "partiallinktext": return driver.findElementByPartialLinkText(locValue);
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element is not found");
		reportStep("Element is not found","fail");
			//throw new RuntimeException();
		}
		return null;
	}

	public WebElement locateElement(String locValue) 
	{
		try {
			return driver.findElementById(locValue);
		} 
		catch (WebDriverException e) 
		{
			System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured", "fail");
			//throw new RuntimeException();
		}
		catch (Exception e)
		{
			System.err.println("Exception has occured");
		reportStep("Exception has occured", "fail");
			//throw new RuntimeException();
		}
		return null;
	}

	public void type(WebElement ele, String data) 
	{
		try 
		{
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The Data "+data+" is Entered Successfully", "pass");
		} 
		catch (WebDriverException e) 
		{
			System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured", "fail"); 
		//	throw new RuntimeException();
		}
		catch (Exception e)
		{
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "fail");
			//throw new RuntimeException();
		}
		finally 
		{
			takeSnap();
		}
	}

	public void click(WebElement ele) 
	{
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked Successfully");
			reportStep("The Element "+ele+" is clicked Successfully", "pass");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException has occured");
			reportStep("The Element "+ele+" is not clicked Successfully", "fail");
		}
		finally 
		{
			takeSnap();		
		}
	}
	public void clear(WebElement ele)
	{
		ele.clear();
	}

	public void clickNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element "+ele+" is clicked Successfully", "pass");

	}



	public String getText(WebElement ele) 
	{
		String text;
		try {
			text = ele.getText();
			System.out.println("Text is received"+text);
			reportStep("Text is received"+text, "pass");
			return text;
		}
		finally
		{
		takeSnap();
		}
		
	}
	public void selectDropDownUsingText(WebElement ele, String value) {
		try 
		{
			Select ele3 = new Select(ele);
			ele3.selectByVisibleText(value);
		} 
		catch (WebDriverException e) {
			System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured", "fail");
		}
		catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "fail");
		}
		finally 
		{
			takeSnap();
		}
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select ele3 = new Select(ele);
			ele3.selectByValue(value);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver Exeception is handled");
			reportStep("Driver Exeception is handled", "fail");
			e.printStackTrace();
		
		}
		finally {
		takeSnap();
		}
	}


	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select ele4 = new Select(ele);
		ele4.selectByIndex(index);
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		System.out.println(title);
		if (expectedTitle.equals(title))
		{
			System.out.println("The Title of the page is "+title);
			reportStep("The Title of the page is "+title, "pass");
			takeSnap();
			return true;
		}
		else
		{
			return false;
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		System.out.println(text);
		if(expectedText.equals(text))
		{
			System.out.println("The Exact test is matching with" +text);
			//reportStep("The Exact test is matching with" +text, "pass"); 
			takeSnap();
		}
		else
		{
			System.out.println("The Exact test is not matching with" +text);
			//reportStep("The Exact test is not matching with" +text, "fail");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		System.out.println(text);
		if(expectedText.equals(text))
		{
			System.out.println("PartialText is matched: "+expectedText);
			//reportStep("PartialText is matched: "+expectedText, "pass");
			takeSnap();
		}
		else
		{
			System.out.println("PartialText is not matched");
			//reportStep("PartialText is not matched", "fail");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String text = ele.getText();
//		System.out.println("The exact attribute is:"+text);
		//reportStep("The exact attribute is:"+text, "pass");
		if(value.equals(text))
		{
			System.out.println("Attribute is matched");
			//reportStep("Attribute is matched", "pass");
			takeSnap();
		}
		else
		{
			System.out.println("Attribute is not matched");
			//reportStep("Attribute is not matched", "fail");
			takeSnap();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String aa = ele.getAttribute(attribute);
		if (aa.contains(value)) {
			System.out.println("Partial Attribute value is verfied: ");
			//reportStep("Partial Attribute value is verfied: ", "pass");
		} 
		else {
			System.out.println("Partial Attribute value is not verfied: ");
			//reportStep("Partial Attribute value is not verfied: ", "fail");
		}
	}

	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		boolean selected = ele.isSelected();
		if(ele.isSelected())
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean displayed = ele.isDisplayed();
		if(ele.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void switchToWindow(int index) {
		//String firstWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(index));


	}


	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		Alert al1 = driver.switchTo().alert();
		al1.accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = getAlertText();
//		System.out.println("The Alert text is " + alertText);
		//reportStep("The Alert text is " + alertText, "pass");
		return alertText;

	}

	public long takeSnap() {
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./snaps/snap"+i+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return i;
		
		
		
		
		
//		int i = 1;
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		File desc = new File("./snaps/img"+i+".png");
//		try {
//			FileUtils.copyFile(src, desc);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("The session is closed");
		//reportStep("The session is closed", "fail");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	public void mouseOver(WebElement ele, WebElement ele1)
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).pause(3000).click(ele1).perform();
		
	}
}