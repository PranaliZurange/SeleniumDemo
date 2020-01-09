package Senarioes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusDisablePopupNotification {

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notification--");
		WebDriver driver=new ChromeDriver(co);//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching -browser");
        driver.get("https://www.redbus.in");
        Thread.sleep(1000);

	}

}
