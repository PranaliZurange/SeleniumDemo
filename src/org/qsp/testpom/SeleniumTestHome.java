package org.qsp.testpom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class SeleniumTestHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://selenium.dev/");
       Thread.sleep(5000);
       SeleniumHome sh=new SeleniumHome(driver);
       Thread.sleep(3000);
       
       sh.searchtext("Testing");
          Thread.sleep(5000);
            
       driver.navigate().back();
         sh.searchtext("downlods");
          
	}

}
