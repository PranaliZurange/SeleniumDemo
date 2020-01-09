package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BlueStoneHomeWork {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		WebElement ring=  driver.findElement(By.xpath("//ul[@class=\"wh-main-menu\"]/li[@class='menuparent repb']/a[@title=\"Rings\"]"));
        Actions a=new Actions(driver);
	    a.moveToElement(ring).build().perform();
	    
        driver.findElement(By.xpath("//ul[@class=\"two-col\"]/descendant::a[contains(.,'Diamond')]")).click();
      
        
        WebElement prices = driver.findElement(By.xpath("//span[contains(.,'Price')]/parent::section[@class=\'block\']"));
        a.moveToElement(prices).build().perform();
        System.out.println(prices.getText());
        
    
}

	}


