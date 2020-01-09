package Senarioes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderStock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.urbanladder.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[@href='../../furniture-stores?src=header']")).click();
        Thread.sleep(2000);
        List<WebElement> menu=  driver.findElements(By.xpath("//h3[@class=\"_3JJeW\"]"));
      Thread.sleep(1000);
 for(WebElement item:menu) 
 {

	System.out.println(item.getText()); 
	
 }
	}

}
