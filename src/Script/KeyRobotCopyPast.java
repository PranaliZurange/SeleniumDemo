package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyRobotCopyPast
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
     WebElement search=driver.findElement(By.name("q"));
     search.sendKeys("java",Keys.ENTER);
     WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[text()='Java']"));
     //or
    // WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[contains(.,'Java')]"));
   Actions a=new Actions(driver);
    a.doubleClick(java).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);
   r.keyRelease(KeyEvent.VK_C);
   r.keyRelease(KeyEvent.VK_CONTROL);
   Thread.sleep(1000);
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_T);
  r.keyRelease(KeyEvent.VK_T);
  r.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(1000);
  r.keyPress(KeyEvent.VK_CONTROL);
  r.keyPress(KeyEvent.VK_V);
 r.keyRelease(KeyEvent.VK_V);
 r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    		

	}

}
