package Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartIphoneHomwork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
       // driver.findElement(By.xpath("//input[@title=\\\"Search for products, brands and more\\\"]")).sendKeys("c#",Keys.ENTER);
       // WebDriverWait ww=new WebDriverWait(driver,10);  
        
        //or
        Actions a=new Actions(driver);
        WebElement search=driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"));
        search.sendKeys("iphone");
        a.moveToElement(search).build().perform();
        Thread.sleep(6000);
        WebElement iph=driver.findElement(By.xpath("//input[@value=\"iphone\"]"));
        iph.click();
       List<WebElement> menu=driver.findElements(By.xpath("//div[@class='_1HmYoV hCUpcT col-12-12']"));
        Thread.sleep(1000);
        for(WebElement item:menu)
    {
	System.out.println(item.getText()); 
	a.moveToElement(item).build().perform();
	//ww.until(ExpectedConditions.titleContains("iphone"));
	Thread.sleep(1000);

    }

	}

}
