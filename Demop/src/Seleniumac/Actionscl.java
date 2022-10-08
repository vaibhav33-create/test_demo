package Seleniumac;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionscl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "vaibhav bansude";
		String[] ar = s.split(" ");
		String rev ="";
		
		for(int i=0;i<ar.length;i++) {
			String ss = ar[i];
			String revar ="";
			for(int j=ss.length()-1;j>=0;j--) {
				revar = revar + ss.charAt(j);
			}
			rev = rev + revar + " ";
		}
		System.out.println(rev);
		
	}

}
