package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPriorityForTest 
{
	 static WebDriver driver;
		@BeforeMethod
		public void beforeMe()
		{
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			driver=new ChromeDriver();//upcasting
		   System.out.println("Launching browser");
		   driver.manage().window().maximize();	
		     driver.get("https://www.google.com/");
		   System.out.println("Before method");
		}
		//0 value are also allowed to set priority
		@Test(priority=0)
		public void demo()
		{
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Reporter.log("Demo",true);
		}
		@Test(priority=1)
		public void demo2()
		{
			driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
			Reporter.log("Demo2",true);
		}
		//-1value are allowed to set priority
		@Test(priority=-1)
		public void demo3()
		{
			driver.findElement(By.name("q")).sendKeys("pranali",Keys.ENTER);
			Reporter.log("Demo3",true);
		}
		@AfterMethod
		public void afterMe()
		{
			driver.close();
		}
//priority set flow
		//-2
		//-1
		//0
		//1
		//2

}
