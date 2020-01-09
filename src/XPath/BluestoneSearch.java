package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSearch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
      WebElement search=driver.findElement(By.id("search_query_top_elastic_search"));
      search.sendKeys("Ring",Keys.ENTER);
      Thread.sleep(5000);
     WebElement ring= driver.findElement(By.xpath("//img[@alt=\"The Nury Vanki Ring\"]"));
     ring.click();
      
	}

}
