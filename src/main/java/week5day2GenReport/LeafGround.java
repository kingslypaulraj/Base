package week5day2GenReport;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// TODO Auto-generated method stub
//				ChromeOptions dr = new ChromeOptions();
//				dr.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> gettingSize = driver.findElementsByXPath("//section[@class='innerblock']//following::table//tr");
		int count = gettingSize.size();
		System.out.println(count);
		
		String sizecol = driver.findElementByXPath("//section[@class='innerblock']//following::table//tr[3]//td[2]").getText();
//		int countcol = sizecol.findElements(By.tagName("td")).get(2).getText();
//		System.out.println(countcol);
		System.out.println(sizecol);
	
		
//		String text = gettingSize.get(2).findElements(By.tagName("td")).get(2).getText();

	}
}

