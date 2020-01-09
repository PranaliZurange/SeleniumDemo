package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppebalActionDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://jqueryui.com/droppable/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
       driver.switchTo().frame(frame);
       WebElement drag=driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-draggable ui-draggable-handle\"]"));
       Actions a=new Actions(driver);
       a.dragAndDropBy(drag, 160, 0).perform();
       WebElement msg=driver.findElement(By.xpath("//p[contains(.,'Dropped!')]"));
       System.out.println(msg.getText());



	}

}
