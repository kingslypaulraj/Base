package week3day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(5000);
		al1.sendKeys("Shanthi");
		System.out.println(al1.getText());
		al1.accept();
		String text = driver.findElementById("demo").getText();
		System.out.println(al1.equals(text));
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
//		String lr = driver.getWindowHandle();
//		List listAll = new ArrayList<String>();
	
		
		
		
		
	    }
	}
