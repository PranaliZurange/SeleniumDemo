import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime5 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://demo.actitime.com/");
      driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
       System.out.println(driver.getTitle());
      Thread.sleep(2000);
      System.out.println("Login sucsessfully..........");
       WebElement time=driver.findElement(By.id("container_reports"));
       time.click();
       Thread.sleep(2000);;
       System.out.println(driver.getTitle());
       driver.findElement(By.id("logoutLink")).click();
       System.out.println("Logout Succsessfully.........");


	}

}
