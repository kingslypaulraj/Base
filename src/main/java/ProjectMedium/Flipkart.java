package ProjectMedium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Flipkart extends SeMethods {
	@Test(groups = {"regression"})
	public void flipkart() throws InterruptedException {
	
		startApp("chrome","https://www.flipkart.com/");
		WebElement flipLaunch = locateElement("xpath", "//button[text() = '✕']");
		click(flipLaunch);
		WebElement tv = locateElement("xpath", "//span[text() ='TVs & Appliances']");
		WebElement samsung = locateElement("xpath", "//a[@title = 'TVs & Appliances']//following::ul[3]/li[8]/a/span");
		mouseOver(tv, samsung);
		WebElement min = locateElement("xpath", "(//select[@class = 'fPjUPw'])[1]");
		selectDropDownUsingValue(min, "25000");
		WebElement max = locateElement("xpath", "(//select[@class = 'fPjUPw'])[2]");
		selectDropDownUsingValue(max, "60000");
		Thread.sleep(3000);
		WebElement screensize = locateElement("xpath", "//div[text()='Screen Size']");
		screensize.click();
		
		WebElement selectScreensize = locateElement("xpath", "//div[text()='48 - 55']/preceding-sibling::div");
		click(selectScreensize);
		Thread.sleep(5000);
		WebElement firstresult = locateElement("xpath", "//a[@target='_blank']/div[2]/div/div");
		click(firstresult);
		switchToWindow(1);
		WebElement compare1 = locateElement("xpath", "//span[text() = 'Compare']//parent::label/preceding-sibling::span");
		click(compare1);
		closeBrowser();
		switchToWindow(0);
		WebElement secondResult = locateElement("xpath", "(//a[@target='_blank'])[2]");
		click(secondResult);
		switchToWindow(1);
		WebElement compare2 = locateElement("xpath", "(//div[@class='_1p7h2j'])[1]");
		click(compare2);
		WebElement compare3 = locateElement("xpath", "//span[text()='COMPARE']");
		click(compare3);
		WebElement item1 = locateElement("xpath", "(//div[@class ='_1vC4OE'])[1]");
		String text1 = getText(item1);
		String replace = text1.replaceAll("\\D+","");
		int parseIntOfItem1= Integer.parseInt(replace);
		WebElement item2 = locateElement("xpath", "(//div[@class ='_1vC4OE'])[2]");
		String text2 = getText(item2);
		String replace2 = text2.replaceAll("\\D+","");
		int parseIntOfItem2 = Integer.parseInt(replace2);
		
		if(parseIntOfItem1<parseIntOfItem2)
		
		{
			Thread.sleep(5000);
			click(item1);
		}
		else
		{
			Thread.sleep(5000);
			click(item2);
		}
	
	}
	

}
