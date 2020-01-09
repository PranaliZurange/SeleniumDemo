package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartMouseMoveActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@class=\'_2AkmmA _29YdH8\']")).click();
        List<WebElement> menu=  driver.findElements(By.xpath("//ul[@class=\'_114Zhd\']/li"));
        Actions a=new Actions(driver);
        Thread.sleep(1000);
        for(WebElement item:menu)
    {
	System.out.println(item.getText()); 
	a.moveToElement(item).build().perform();
	Thread.sleep(1000);

    }
	}
}

