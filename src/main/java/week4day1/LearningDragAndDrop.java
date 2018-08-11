package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElementByXPath("//li/a[text() = 'Droppable']").click();
		WebElement insideFrame = driver.findElementByXPath("//iframe[@class = 'demo-frame']");
		driver.switchTo().frame(insideFrame);

		WebElement drag1 = driver.findElementByXPath("//div[@id = 'draggable']");
//		driver.switchTo().frame(drop1);
		WebElement drop1 = driver.findElementByXPath("//div[@id = 'droppable']");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag1, drop1).perform();
	
		driver.findElementByXPath("//a[text() = 'Sortable']").click();
		WebElement item1 = driver.findElementByXPath("//ul/li[text() = 'Item 1']");
		Actions builder1 = new Actions(driver);
		builder1.dragAndDropBy(item1, 600, 600).release().perform();
		
		
	}

}
