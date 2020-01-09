package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookDragDropAction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s=new Select(day);
		s.selectByValue("24");
		WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select m=new Select(month);
		//m.selectByValue("11");
		    //  or
		m.selectByIndex(11);
		WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select y=new Select(year);
		y.selectByValue("1993");
		

	}

}
