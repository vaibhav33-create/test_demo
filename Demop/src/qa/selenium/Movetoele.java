package qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\New folder\\selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]"));
		
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act = new Actions(driver);
		//Drag and drop actions
	//	act.dragAndDrop(drag, drop).build().perform();
		//moveToElement using clickAndHold
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

}
