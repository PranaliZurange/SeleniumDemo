package ReadFileData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSerachJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://selenium.dev/");
       Thread.sleep(2000);
     WebElement ele=  driver.findElement(By.xpath("//input[@name='search']"));
     ele.sendKeys("Testing",Keys.ENTER);
     Thread.sleep(1000);
     driver.navigate().back();
     ele.sendKeys("java",Keys.ENTER);
	}

}
