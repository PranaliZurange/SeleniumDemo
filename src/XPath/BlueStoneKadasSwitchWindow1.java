package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BlueStoneKadasSwitchWindow1 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
      WebElement search=driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery.html\"]"));
      System.out.println(search.getText());
      Actions a=new Actions(driver);
      Thread.sleep(5000);
      a.moveToElement(search).build().perform();     
       Thread.sleep(5000);
     WebElement kadas= driver.findElement(By.xpath("//li/a[@title='Kadas']"));
     Thread.sleep(2000);
        kadas.click();
        String parent_window=driver.getWindowHandle();
     driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
     Thread.sleep(1000);
     for(String child_window:driver.getWindowHandles())
     {
    	 driver.switchTo().window(child_window);
     }
     Thread.sleep(1000);//size selected* fild and click on bye now
                                         //or
      // driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
      // driver.findElement(By.xpath("//ul[@id='sizeDropdown']/descendant::span[contains(.,'2-2(2 2/16\")')]")).click();
      //Thread.sleep(2000);
   WebElement bye= driver.findElement(By.xpath("//div/input[@id='buy-now']"));
 bye.click();
 //or  err msg print
 WebElement err=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
 System.out.println(err.getText());

	}

}
