package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCntains 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();//upcasting
	driver.manage().window().maximize();	
   System.out.println("Launching browser");
    driver.get("https://demo.actitime.com/");
    Thread.sleep(2000);
    WebElement admin = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	String name =admin.getText();//gettext()is used to get the inner text in console
	System.out.println(name);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
	WebElement manger = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	String pass1 =manger.getText();
	System.out.println(pass1);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass1);
	driver.findElement(By.xpath("//td[@valign='top']/a[@id='loginButton']")).click();
	
}
}
