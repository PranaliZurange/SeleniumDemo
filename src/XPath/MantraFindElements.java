package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MantraFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.myntra.com/");
        Thread.sleep(10000);
 List<WebElement> menu=  driver.findElements(By.xpath("//div[@class=\"desktop-navLink\"]"));
 for(WebElement item:menu)
 {
	System.out.println(item.getText()); 
 }

	}

}
