package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJavaPageScrollJSExicuter 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
     WebElement search=driver.findElement(By.name("q"));
     search.sendKeys("JAVA",Keys.ENTER);
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     WebElement nt= driver.findElement(By.xpath("//span[text()='Next']"));
     while (nt.isEnabled());
     {
		
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		nt.click();
	}
   
	}

}
