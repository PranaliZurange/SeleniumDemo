package Senarioes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimePopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notification--");
		WebDriver driver=new ChromeDriver(co);//upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://demo.actitime.com/");
      driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
       Thread.sleep(1000);
   driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div[@class='popup_menu_icon']")).click();
     //or
 // driver.findElement(By.xpath("//div[@class='menuTable']/descendant::div[@class='menu_icon'][3]")).click();
	driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	WebElement fetch=driver.findElement(By.xpath("//span[text()='© 2019 actiTIME Inc. All rights reserved.']"));
	System.out.println(fetch.getText());
	}
	

}
