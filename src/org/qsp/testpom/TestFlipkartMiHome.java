package org.qsp.testpom;

//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.FlipkartHome;
//import org.qsp.pom.FlipkartMiHome;

public class TestFlipkartMiHome 
{
  public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
     // Thread.sleep(2000);
       
       FlipkartMiHome fmi=new FlipkartMiHome(driver);
        Thread.sleep(5000);
        fmi.popup();
        Thread.sleep(5000);
       
        fmi.electronicMouse(driver);
        Thread.sleep(5000);
        
        fmi.brand();
        Thread.sleep(4000);
         
        fmi.mobile();
        Thread.sleep(3000);
        
        //or direct
     Set<String> parent=driver.getWindowHandles();
        for (String child: parent)
        {
			driver.switchTo().window(child);
		}    
     /*  fmi.Switch_Tab(driver); 
       Thread.sleep(5000); 
        fmi.addcart(); 
        Thread.sleep(5000);
        System.out.println("add to cart");  */
	}

}
