package Senarioes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("http://demo.guru99.com/v1/index.php");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
              Alert al= driver.switchTo().alert();
              Thread.sleep(3000);
              System.out.println(al.getText());
               al.accept();
	}

}
