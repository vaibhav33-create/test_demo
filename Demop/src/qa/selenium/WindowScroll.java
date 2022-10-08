package qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement ele = driver.findElement(By.xpath("(//*[@class='canvas-middle'])[5]"));
		// Horizontal scroll on the web page.
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//ele.click();
		WebElement ee = driver.findElement(By.id("philadelphia-field-email"));
		//To scroll down the web page by the visibility of the element.
		js.executeScript("arguments[0].scrollIntoView();", ee);
		ee.sendKeys("vaibhav");
		///js.executeScript("window.scrollBy(0,1000)");
		
	}

}
