import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://demo.actitime.com/");
       String home=driver.getTitle();
       //System.out.println(s1);
      driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
       Thread.sleep(2000);
       String login=driver.getTitle();
       System.out.println(home+"  "+login);
       if(!home.equals(login)) {
    	   System.out.println("login done");
    	   driver.findElement(By.id("logoutLink")).click();
       }
       String logout=driver.getTitle();
    		   if(home.equals(logout))
    			   System.out.println("logout....");
	}

}
