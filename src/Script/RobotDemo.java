package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Robot r=new Robot();
        //for open new tab
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_CONTROL);
       //for close the tab
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_W);
      r.keyRelease(KeyEvent.VK_W);
      r.keyRelease(KeyEvent.VK_CONTROL);
      // for open new window
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_N);
       r.keyRelease(KeyEvent.VK_CONTROL);
       
	}

}
