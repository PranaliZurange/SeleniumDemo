package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanladderFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.urbanladder.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
       List<WebElement> menu=  driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
 for(WebElement item:menu)//findelements useto display multipal values in console 
 {
	System.out.println(item.getText()); 
 }
        //span[contains(.,'Sale')]/parent::li/descendant::ul[@class="taxonslist"]/li
        }
	 
	}


