package qa.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String title = driver.getTitle();
		System.out.println(title);
		String q = driver.getWindowHandle();
		//System.out.println(q);
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		String s = driver.getWindowHandle();
		//System.out.println(s);
		
		
		Set<String> as = driver.getWindowHandles();
		Iterator<String> dd = as.iterator();
		//Get parent window id
		String parent = dd.next();
		System.out.println(parent);
		//Get child window id
		String child = dd.next();
		System.out.println(child);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parent);
		
		
	}

}
