package BlueStoneHomwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneSenario12 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//div[@class='hp-gms-banner']/descendant::strong[text()='10 + 1']")).click();
     Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value=\"Start Now\"]")).click();
WebElement amterr=	driver.findElement(By.xpath("//ul[@id=\"amount_error\"]/li[text()='Amount is required']"));
       System.out.println(amterr.getText());
       WebElement emlerr=	driver.findElement(By.xpath("//ul[@id=\"Email_error\"]/li[text()='Email is required']"));
      System.out.println(emlerr.getText());
      System.out.println("filed is requierd message should be display.......");
       driver.close();
	}

}
