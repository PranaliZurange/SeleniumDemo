import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSendingData {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://accounts.google.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       WebElement email=driver.findElement(By.name("identifier"));
       email.sendKeys("pranalizurange");
       WebDriverWait wait=new WebDriverWait(driver, 20);               
      WebElement emailnext=driver.findElement(By.id("identifierNext"));
       emailnext.click();
      // WebDriverWait wait1 = new WebDriverWait(driver, 20);
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        
       WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
       password.sendKeys("pranali4022");
       WebDriverWait wait2 = new WebDriverWait(driver, 10);
       WebElement passnext=driver.findElement(By.id("passwordNext"));
       passnext.click();
	}

}
