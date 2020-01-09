import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.naukri.com/");
      // String url=driver.getCurrentUrl();
      // System.out.println(url);
       //System.out.print(driver.getTitle());
      // driver.close();//not work for child prents//
      // driver.quit();//not work for child parents//
       String parent=driver.getWindowHandle();
       System.out.println(parent);//id of parent window(fouc)
       Set<String> wins=driver.getWindowHandles();//id of childe browser
       System.out.println(wins.getClass());
       wins.remove(parent);//remove  parents window and focus on child window
       for(String win:wins)
       {
    	   System.out.println(win);
    	   driver.switchTo().window(win);
    	   driver.close();
       }
       
       
	}

}
