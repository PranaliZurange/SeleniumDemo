package Script2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderScreenShot
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       System.out.println("Launching browser");
        driver.get("https://www.urbanladder.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
        List<WebElement> menu=  driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
      Actions a=new Actions(driver);
      Thread.sleep(1000);
 for(WebElement item:menu)//findelements useto display multipal values in console 
 {
	// System.out.println(menu.getClass());
	 String name=item.getText();//to get the text and name the sreenshot as per that
	 System.out.println(item.getText());
	a.moveToElement(item).build().perform();
	Thread.sleep(1000);
	ScreenShotMethod.screenshot(driver,name);//call the  static method screenshotmethod.java
	
	}	

	

	}
}