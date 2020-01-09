package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookRightClickOnWebElement {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//upcasting
	       System.out.println("Launching browser");
	       Thread.sleep(2000);
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();	
	       Thread.sleep(2000);
	      WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
	       Actions a=new Actions(driver);
	       a.contextClick(email).perform();

	}

}
