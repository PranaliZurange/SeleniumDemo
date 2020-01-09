package Homework7Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Senario20 {
	 @Test
		public void ring()throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();// upcasting
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Launching browser");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://jqueryui.com/slider");
			WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		       driver.switchTo().frame(frame);
		       WebElement slider=driver.findElement(By.xpath("//div[@class=\"ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"]"));
		       Actions a=new Actions(driver);
		       for(int i=1;i<10;i++)
		       {
		    a.dragAndDropBy(slider, 170, 0).perform();
		   a.dragAndDropBy(slider, -170,0).perform();
		       }
		 driver.close();      
	 }
}
