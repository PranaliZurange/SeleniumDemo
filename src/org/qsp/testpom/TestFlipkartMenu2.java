package org.qsp.testpom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.FlipkartMenu;

public class TestFlipkartMenu2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		FlipkartMenu fh=new FlipkartMenu(driver);
    Thread.sleep(5000);
		
		fh.clickPopup();
		Thread.sleep(3000);
		
		fh.mouseOverElec(driver);
		Thread.sleep(2000);
		
		fh.realMe();
		Thread.sleep(5000);
		
		fh.realMe1();
		Thread.sleep(5000);
		
		
		Set<String> parent = driver.getWindowHandles();
		for (String child : parent) 
		{
			driver.switchTo().window(child);
		}
		
		
		fh.addToCart();
		
		
		
		

	}

}
