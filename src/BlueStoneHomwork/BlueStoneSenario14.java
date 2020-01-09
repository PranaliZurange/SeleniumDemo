package BlueStoneHomwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneSenario14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
		 driver.manage().window().maximize();
     driver.findElement(By.xpath("//div[@class='hp-gms-banner']/descendant::strong[text()='10 + 1']")).click();
    
     Thread.sleep(1000);
    WebElement amount=driver.findElement(By.xpath("//input[@name=\"amount\"]"));
     amount.sendKeys("1500");
     
     WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
     email.sendKeys("pranalizurange@gmail.com");
     Thread.sleep(2000);
     String s1=driver.getTitle();
     System.out.println(s1);
     driver.findElement(By.xpath("//div[@class=\"form-submit text-center auto-filled\"]/input[@type='submit']")).click();
   String s2=driver.getTitle();
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	 if(s1!=(s2))
     {
		 System.out.println(" it is  reflected in next page");
     }
	 else
	 {
		 System.out.println(" it is reflected in this page");
	     }
	
  driver.close();
	}

}
