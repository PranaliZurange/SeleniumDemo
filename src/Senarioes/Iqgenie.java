package Senarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iqgenie {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://iqgenie.org/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       driver.findElement(By.xpath("//i[@class='person fas fa-user-circle']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='hollow button alert']")).click(); 
        Thread.sleep(1000);
        String parent_window=driver.getWindowHandle();
        for(String child_window:driver.getWindowHandles())
        {
       	 driver.switchTo().window(child_window);
        }
        String s1=driver.getTitle();
        System.out.println(s1);
	}

}
