package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.FlipkartHome;

public class TestFlipkartHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
      Thread.sleep(2000);
       
        FlipkartHome fh=new FlipkartHome(driver);
        Thread.sleep(5000);
        fh.popup();
        Thread.sleep(5000);
        
        fh.searchtext("iphone");
        Thread.sleep(5000);
        fh.clickB();
        Thread.sleep(5000);
        
        driver.navigate().back();
        Thread.sleep(5000);
        fh.searchtext("Nike");
        fh.clickB();

	}

}
