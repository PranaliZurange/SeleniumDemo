import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCloseRevers2 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
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
          al.addAll(wins);
          for(int i=al.size()-1;i>=0;i--)
          {
       	   driver.switchTo().window(al.get(i)).close();
          }
          
          
          
     // for(String win:wins)
     // {
    // drvier.switchto().window(al.ad(win.get().close()));
      //}
      
	}

}
