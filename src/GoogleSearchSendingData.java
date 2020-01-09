import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSendingData 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();	
       Thread.sleep(2000);
     WebElement search=driver.findElement(By.name("q"));
     search.sendKeys("java",Keys.ENTER);//enter is static variable(value)
     //WebElement gbutton=driver.findElement(By.name("btnK"));
     //gbutton.click();not working because after writing java we cannot visibal google serch button
    // after writing java we can click on enter button
     
	}

}
