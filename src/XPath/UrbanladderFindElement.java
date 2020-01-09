package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanladderFindElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.urbanladder.com/");
        Thread.sleep(10000);
        
         driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
         WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
         System.out.println(sale.getText());
         WebElement decor=driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
         System.out.println(decor.getText());

	}

}
