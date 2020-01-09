package Script2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfXYAcsees {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();	
    WebElement lb  = driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']"));
       Point loc=lb.getLocation();
       System.out.println(loc);
       int x=loc.getX();
       int y=loc.getY();
       System.out.println(x+" "+y);

	}

}
