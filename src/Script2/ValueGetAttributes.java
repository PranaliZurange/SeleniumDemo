package Script2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueGetAttributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();	
       WebElement email=driver.findElement(By.id("email"));
      // fetch the title without using gettitle method with the help of get attributes method
       String val=email.getAttribute("name");
       System.out.println(val);
       

	}

}
