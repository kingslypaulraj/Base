package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class = 'ui-layout-north ui-layout-pane ui-layout-pane-north']"));
				//		driver.findElementByTagName("iframe").getSize();
	}

}
