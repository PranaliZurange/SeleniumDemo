package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://jqueryui.com/slider/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
       driver.switchTo().frame(frame);
       WebElement slider=driver.findElement(By.xpath("//div[@class=\"ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"]"));
       Actions a=new Actions(driver);
       a.dragAndDropBy(slider, 50, 0).perform();

	}

}
