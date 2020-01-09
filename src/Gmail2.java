import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail2 {

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
       driver.findElement(By.id("identifierNext")).click();
      Thread.sleep(5000);
      driver.findElement(By.name("password")).sendKeys("pranali4022",Keys.ENTER);
       }

}
