package Script2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FacebookTakeScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.manage().window().maximize();	
       driver.get("https://www.facebook.com/");
 TakesScreenshot  ts= (TakesScreenshot)driver;
 File Screenshot=ts.getScreenshotAs(OutputType.FILE) ;
 File Screensave=new File(".\\ScreenShot\\facebook.png");
 Files.copy(Screenshot, Screensave);
	}

}
