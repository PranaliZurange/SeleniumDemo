package Script2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageTitleWithoutUseGetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();		
		 Thread.sleep(2000);
       System.out.println("Launching browser");
       driver.get("https://www.facebook.com/");
        //<head> tag is contain title of webpage
       System.out.println("Title of webpage by gettitle methof:"+driver.getTitle());
       WebElement titleEle=driver.findElement(By.tagName("title"));
       System.out.println("Title of webpage by webelement title:"+titleEle.getAttribute("textContent"));
       //textContent is used to fetch inner text it present in getattributes
	}

}
