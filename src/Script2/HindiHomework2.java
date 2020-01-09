package Script2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HindiHomework2 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	 System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
      
       WebElement lan=driver.findElement(By.xpath("//div[@id='SIvCob']/a[text()='हिन्दी']"));
     
       Actions a=new Actions(driver);
       Thread.sleep(1000); 
  a.moveToElement(lan).perform();
        Robot r=new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_C);
       r.keyRelease(KeyEvent.VK_C);
       r.keyRelease(KeyEvent.VK_CONTROL);
       Thread.sleep(1000);
     
      // driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
       Thread.sleep(1000);
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        
       
	}
}
