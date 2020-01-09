import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
  
       driver.get("https://accounts.google.com/");
       driver.manage().window().maximize();	
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait
       WebElement email=driver.findElement(By.name("identifier"));
       email.sendKeys("pranalizurange");               
      WebElement emailnext=driver.findElement(By.id("identifierNext"));
       emailnext.click();
    //  Thread.sleep(2000);
      WebElement password=driver.findElement(By.name("password"));
      password.sendKeys("pranali4022");
     
      WebElement passnext=driver.findElement(By.id("passwordNext"));
      passnext.click();
	}

}
