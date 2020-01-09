package Script2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollUsingJavaScriptExicuter {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("http://selenium.dev/");
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");//for y index(top to down 1000)
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-1000)");//for y index(down to top -1000)
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//for scolling till the end of webpage
	      Thread.sleep(5000);
	     // js.executeScript("window.scrollTo(document.body,0)");
	         Thread.sleep(5000);
	      js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//for scrolling top webpafe
	      
	}
	

}
