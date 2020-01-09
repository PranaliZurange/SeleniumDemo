package BlueStoneHomwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneSenaio15 {

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
     email.sendKeys("pranalizurange411@gmail.com");
     
    driver.findElement(By.xpath("//div[@class=\'form-submit text-center auto-filled\']/input[@type='submit']")).click();
   String s1=driver.getTitle();
    Thread.sleep(4000);

   driver.findElement(By.xpath("//div[@class='col-xs-offset-10 col-xs-2 text-right auto-filled']/input[6]")).click();
    
   WebElement err1=driver.findElement(By.id("contactNumber_error"));
   System.out.println(err1.getText());
   
   WebElement err2=driver.findElement(By.id("fullname_error"));
   System.out.println(err2.getText());
   
   WebElement err3=driver.findElement(By.id("address_error"));
   System.out.println(err3.getText());
   
   WebElement err4=driver.findElement(By.id("postcode_delivery_error"));
   System.out.println(err4.getText());
   
   
   /* String s2=driver.getTitle();
   if(s1.equals(s2))
   {
	   System.out.println("fill the requierd fill");
	}*/
	}
}
