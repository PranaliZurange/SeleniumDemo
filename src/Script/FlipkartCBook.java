package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartCBook {

	public static void main(String[] args) throws InterruptedException 
	{
		double i=0;
		double big=0;
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
       // driver.findElement(By.xpath("//input[@title=\\\"Search for products, brands and more\\\"]")).sendKeys("c#",Keys.ENTER);
                                          //or
        WebElement search=driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"));
        search.sendKeys("C#");
        driver.findElement(By.xpath("//button[@class=\"vh79eN\"]")).click();
        Thread.sleep(7000);
   driver.findElement(By.xpath("//div[@class=\"_3ywJNQ\"]/descendant::div[contains(.,'Price -- Low to High')]")).click();
  
  // Thread.sleep(7000);
      
	}

}
