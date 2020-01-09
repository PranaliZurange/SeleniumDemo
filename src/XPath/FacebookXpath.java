package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pranali");
                           //1stcode
      // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prasad");
      // driver.findElement(By.xpath("//input[@type='submit']")).click();
                                    //or
                                //2ndcode
driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("prasad");
driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']")).click();
	}

}
