package Script2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExicuertXaccsess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
      // driver.manage().window().maximize();	
       driver.get("https://www.facebook.com/");
       Thread.sleep(1000);
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(500,0)");
       Thread.sleep(2000);
       js.executeScript("window.scrollBy(-500,0)");
       Thread.sleep(2000);
       js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
       Thread.sleep(2000);
       js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
	}

}
