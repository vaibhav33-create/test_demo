package qa.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tml-user:Tata@2020@ibpodev.home.tatamotors/KAM/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("testing_user2");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		
		//To get all header value from table
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id='tablesorter1']/thead/tr"));
		
		int size = ele.size();
		
		for(int i=0;i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
		}
		
		List<WebElement>rsize = driver.findElements(By.xpath("//table[@id='tablesorter1']/tbody/tr"));
		System.out.println(rsize.size());
		
		//To get specific row data from table
		List<WebElement> csize = driver.findElements(By.xpath("//table[@id='tablesorter1']/tbody/tr[1]/td"));
		int ccnt = csize.size();
		for(int i=0;i<csize.size();i++) {
			System.out.println(csize.get(i).getText());
		}
		//To get column data from table
		String before_xpath = "//table[@id='tablesorter1']/tbody/tr[";
		String after_xpath = 	 "]/td[2]";
		
		for(int i=1;i<=rsize.size();i++) {
			String actual_xpath = before_xpath+i+after_xpath;
			
			WebElement ele3 = driver.findElement(By.xpath(actual_xpath));
			System.out.println(ele3.getText());
		}

	}

}
