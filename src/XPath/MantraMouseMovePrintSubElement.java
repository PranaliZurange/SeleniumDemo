package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MantraMouseMovePrintSubElement
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.myntra.com/");
        Thread.sleep(1000);
 List<WebElement> menues=  driver.findElements(By.xpath("//div[@class=\"desktop-navLink\"]"));
 Actions a=new Actions(driver);
 for(WebElement menue:menues)
 {
 	a.moveToElement(menue).build().perform();
 	String menu=menue.getText();
 	String pranali=menu.substring(0, 1).substring(1).toLowerCase();
 	System.out.println(pranali);
 	System.out.println(menue.getText());
 	System.out.println("..................................");
 	Thread.sleep(1000);
 List<WebElement>submenu=driver.findElements(By.xpath("//a[contains(.,'"+pranali+"')]/parent::div/parent::div/parent::div/parent::nav/parent::div/descendant::li[@class=\"desktop-oddColumnContent\"]/descendant::ul[@class=\"desktop-navBlock\"]/li"));
 for(WebElement subitemname:submenu)//nested for each loop print to submenues
 {
 	System.out.println(subitemname.getText());
 }
 	
  }	


	}

}
