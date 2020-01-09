package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCopyXpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://demo.actitime.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//td[@id='headerContainer']"));
		String name =username.getText();//gettext()is used to get the inner text in console
		System.out.println(name);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
		WebElement pass = driver.findElement(By.xpath("//td[@id='headerContainer']"));
		String pass1 =pass.getText();//gettext()is used to get the inner text in console
		System.out.println(pass1);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass1);
		driver.findElement(By.xpath("//td[@valign='top']/a[@id='loginButton']")).click();
		Thread.sleep(2000);
		WebElement err = driver.findElement(By.xpath("//td[@valign='top']/span[@class='errormsg']"));
		String err1 =err.getText();//gettext()is used to get the inner text in console
		System.out.println(err1);
		
		
		
	}

}
