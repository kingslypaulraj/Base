package week3day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndFrames {

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
	    }
	}
