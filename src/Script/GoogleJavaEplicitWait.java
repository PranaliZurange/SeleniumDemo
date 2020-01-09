package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleJavaEplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       driver.manage().window().maximize();	
       WebDriverWait ww=new WebDriverWait(driver,10);
       driver.get("https://www.google.com/");
     
       WebElement search=driver.findElement(By.name("q"));
       search.sendKeys("java",Keys.ENTER);
      ww.until(ExpectedConditions.titleContains("java"));
       driver.close();


	}

}
