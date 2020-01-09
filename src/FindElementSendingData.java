import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementSendingData 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
       WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("pranali");
       WebElement pass=driver.findElement(By.id("pass"));
       pass.sendKeys("prasad");
       WebElement log_in=driver.findElement(By.id("loginbutton"));
        log_in.click();

	}

}
