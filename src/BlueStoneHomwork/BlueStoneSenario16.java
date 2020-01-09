package BlueStoneHomwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneSenario16 {

	public static void main(String[] args) throws InterruptedException    
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//div[@class='hp-gms-banner']/descendant::strong[text()='10 + 1']")).click();
     Thread.sleep(1000);
    WebElement amount=driver.findElement(By.xpath("//input[@name=\"amount\"]"));
     amount.sendKeys("1500");
     
     WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
     email.sendKeys("pranalizurange111@gmail.com");
     
    driver.findElement(By.xpath("//div[@class=\'form-submit text-center auto-filled\']/input[@type='submit']")).click();
  
    Thread.sleep(4000);
   
    WebElement phone=driver.findElement(By.id("contactNumber"));
    phone.sendKeys("7789654392");
    
    WebElement name=driver.findElement(By.id("fullname"));
    name.sendKeys("pranalizurange");
    
    WebElement add=driver.findElement(By.id("address"));
    add.sendKeys("hadapsar");
    
    WebElement pin=driver.findElement(By.id("postcode_delivery"));
    pin.sendKeys("410502");
    
    driver.findElement(By.xpath("//div[@class='col-xs-offset-10 col-xs-2 text-right auto-filled']/input[6]")).click();
    String s1=driver.getTitle();
    Thread.sleep(4000);
	
	 WebElement nom=driver.findElement(By.id("nomineeName"));
	    nom.sendKeys("prasad zurange");
	
	    WebElement reletionship=driver.findElement(By.xpath("//select[@id='nomineeRelationship']/option[1]"));
	    reletionship.click();
	  
	    
	    WebElement nath=driver.findElement(By.xpath("//select[@id='nomineeNationality']/option[1]"));
	    nath.click();
	    driver.findElement(By.xpath("//input[@name=\"_eventId_checkoutSaveAddressDetails\"]")).click();
	    String s2=driver.getTitle();
	if(s1!=(s2))
	{
		System.out.println("navigating to paymnt page");
	}
	else
	{
		System.out.println("not nevigating");
	}
	}
	

}
