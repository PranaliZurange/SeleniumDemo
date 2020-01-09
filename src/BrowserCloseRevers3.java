import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCloseRevers3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.manage().window().maximize();
       driver.get("https://www.naukri.com/");
       String parent=driver.getWindowHandle();
       System.out.println(parent);//id of parent window(fouc)
       Set<String> wins=driver.getWindowHandles();//id of childe browser
       System.out.println(wins.getClass());
       ArrayList<String> al=new ArrayList<>(wins);
          for(String win:wins)
          {
       	  al.add(win);
       	  driver.switchTo().window(win).close();
          }
          
     }

}
