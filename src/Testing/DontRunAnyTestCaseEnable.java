package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DontRunAnyTestCaseEnable
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
	@Test(enabled=false)
	public void demo()
	{
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	Reporter.log("Demo",true);
	}
	@Test
	public void demo2()
	{
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		Reporter.log("Demo2",true);
	}
	@AfterMethod
	public void afterMe()
	{
		driver.close();
	}


}
