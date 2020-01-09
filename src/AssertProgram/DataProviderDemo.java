package AssertProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
@DataProvider
public String[][] getData()
{
	String[][] data=new String[3][2];
	data[0][0]="user A";
	data[0][1]="A1";
	
	data[1][0]="user B";
	data[1][1]="B1";
	
	data[2][0]="user c";
	data[2][1]="C1";
	return data;
	
}
@Test(dataProvider="getData")
public void createUser(String un,String pw) throws InterruptedException
{
	Reporter.log("create:"+un+"pwd:"+pw,true);
	//System.out.println(un+" "+pw);
	
	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();//upcasting
   System.out.println("Launching browser");
   Thread.sleep(2000);
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();	
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@type='email']")).sendKeys(un);
driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pw);
driver.close();
}
}
