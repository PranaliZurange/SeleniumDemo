package Senarioes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleThird {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
      
       WebElement search=driver.findElement(By.name("q"));
       search.sendKeys("thanose",Keys.ENTER);
       WebElement number = driver.findElement(By.xpath("//div[@id='resultStats']"));
       Thread.sleep(1000);
       System.out.println(number.getText());
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,500)");
       Thread.sleep(2000);
   driver.findElement(By.xpath("//canvas[@jsname=\"wvK4k\"]")).click();
    Thread.sleep(1000);
  // JavascriptExecutor js=(JavascriptExecutor)driver;
   WebElement ele=driver.findElement(By.xpath("//div[text()='About 38,650,000 results (0.45 seconds)']"));
   js.executeScript("arguments[0].scrollIntoView() ", ele);
   System.out.println(ele.getText());
   

	}

}
