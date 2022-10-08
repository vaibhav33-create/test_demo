package qa.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tml-user:Tata@2020@ibpodev.home.tatamotors/KAM/");
		driver.findElement(By.name("username")).sendKeys("testing_user2");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		//Maximize window
		driver.manage().window().maximize();
		//Minimize window
		driver.manage().window().setPosition(new Point(0,-2000));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		driver.manage().window().maximize();
		Dimension d = new Dimension(480,620);
		driver.manage().window().setSize(d);
		driver.findElement(By.xpath("//*[@class='fa-add']")).click();
		Select select = new Select(driver.findElement(By.name("lob")));
		//select.selectByIndex(5);
		select.selectByValue("Pickups");
		//Get all options from dropdown
		List<WebElement> drops = select.getOptions();
		System.out.println(drops.size());
		for(int i=0;i<drops.size();i++) {
			System.out.println(drops.get(i).getText());
		}
		
		
		
		WebElement e = driver.findElement(By.name("arn"));
		Actions act = new Actions(driver);
		//act.contextClick(e).build().perform();
		
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@title='View']")).click();
		String s = driver.findElement(By.name("acctname")).getAttribute("readonly");
		System.out.println(s);
	//	driver.findElement(arg0)
		
		
		TakesScreenshot as = ((TakesScreenshot)driver);
		File sfile = as.getScreenshotAs(OutputType.FILE);
		
		File DFile=new File("E:\\screenshot.png");
		
	try {
		org.openqa.selenium.io.FileHandler.copy(sfile, DFile);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
	
		

	}

}
