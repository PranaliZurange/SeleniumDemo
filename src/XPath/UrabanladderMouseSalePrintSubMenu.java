package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrabanladderMouseSalePrintSubMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.urbanladder.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
        List<WebElement> menu=  driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
      Actions a=new Actions(driver);
      Thread.sleep(1000);
 for(WebElement item:menu)//findelements use to display multipal values in console \\
 {
	System.err.println(item.getText());
	String name=item.getText();//used to concat the string//sale+living+bedroom......
	a.moveToElement(item).build().perform();
	Thread.sleep(1000);
List<WebElement>submenu=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
for(WebElement subitemname:submenu)//nested for each loop print to submenues
{
	System.out.println(subitemname.getText());
}
	
 }

	}

}
