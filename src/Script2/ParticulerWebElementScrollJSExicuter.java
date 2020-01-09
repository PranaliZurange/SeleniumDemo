package Script2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticulerWebElementScrollJSExicuter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("http://selenium.dev/");
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
       WebElement ele=driver.findElement(By.xpath("//h2[text()='News']"));
       js.executeScript("arguments[0].scrollIntoView() ", ele);
       

	}

}
