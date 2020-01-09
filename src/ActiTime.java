import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://demo.actitime.com/");
       Thread.sleep(2000);
       String s1=driver.getTitle();
       System.out.println(s1);
       driver.manage().window().maximize();	
      // String s1=driver.getTitle();
      // System.out.println(s1);
       WebElement user=driver.findElement(By.name("username"));
       user.sendKeys("admin");
       WebElement pass=driver.findElement(By.name("pwd"));
       pass.sendKeys("manager");
       WebElement btn=driver.findElement(By.id("loginButton"));
        btn.click();
        Thread.sleep(2000);
        
       String s2=driver.getTitle();
       System.out.println(s2);
       if(s1!=(s2))
       {
    	   System.out.println("Successfuuly login...");
       }
       
       WebElement btn1=driver.findElement(By.id("logoutLink"));
       btn1.click();
	   System.out.println("Succseefully  logout......");
	}

}
