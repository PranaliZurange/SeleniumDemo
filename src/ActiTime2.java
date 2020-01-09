import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://demo.actitime.com/");
      // String home=driver.getTitle();
       //System.out.println(s1);
      driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
      // Thread.sleep(2000);
      // String login=driver.getTitle();
       WebElement time=driver.findElement(By.id("container_tt"));
       time.click();
       Thread.sleep(2000);;
       String time1=driver.getTitle();
      WebElement user=driver.findElement(By.id("usersManagementBodyTagId"));
      user.click();
      Thread.sleep(2000);
      String user1=driver.getTitle();
       System.out.println(time1+"  "+user1);
       Thread.sleep(2000);
       if(!time1.equals(user1)) {
    	   //System.out.println("login done");
    	   System.out.println("userlist page should be display");
    	   driver.findElement(By.id("logoutLink")).click();
       }
       String logout=driver.getTitle();
    		   if(time1.equals(user1))
    			   System.out.println("logout....");
	}

	}


