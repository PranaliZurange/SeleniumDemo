package ReadFileData;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonTopToBottomScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.amazon.com/");
        Thread.sleep(10000);
        TakesScreenshot  ts= (TakesScreenshot)driver;
        File Screenshot=ts.getScreenshotAs(OutputType.FILE) ;
        File Screensave=new File(".\\ScreenShot\\amazon.png");
        Files.copy(Screenshot, Screensave);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
        TakesScreenshot  ts1= (TakesScreenshot)driver;
        File Screenshot1=ts1.getScreenshotAs(OutputType.FILE) ;
        File Screensave1=new File(".\\ScreenShot\\amazonbottom.png");
        Files.copy(Screenshot1, Screensave1);
    WebElement back= driver.findElement(By.xpath("//span[text()='Back to top']"));
        //  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
          back.click();
    //js.executeScript("arguments[0].scrollIntoView() ", aa);
   
       // Thread.sleep(1000);
	}

}
