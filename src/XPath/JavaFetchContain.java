package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaFetchContain {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//upcasting
	       System.out.println("Launching browser");
	       Thread.sleep(2000);
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();	
	       Thread.sleep(2000);
	       WebElement search=driver.findElement(By.name("q"));
	     search.sendKeys("java");
	      Thread.sleep(1000);
	        Actions a=new Actions(driver);
	        List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='erkvQe']/descendant::li"));
	        Thread.sleep(1000);
	        for(WebElement item:menu)
	    {
		System.out.println(item.getText()); 
		a.moveToElement(item).build().perform();
		Thread.sleep(1000);

	    }

	}

}
