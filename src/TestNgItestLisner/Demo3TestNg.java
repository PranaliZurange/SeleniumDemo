package TestNgItestLisner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(GoogleList.class)

public class Demo3TestNg {
	 
		@Test
		public void google() throws InterruptedException
		{
			
			  WebDriver driver=new ChromeDriver();//upcasting
		   System.out.println("Launching browser");
		   driver.manage().window().maximize();	
		     driver.get("https://www.google.com/");
		   Thread.sleep(2000);
		   driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			Reporter.log("Demo",true);
			driver.close();
		}
	
}
