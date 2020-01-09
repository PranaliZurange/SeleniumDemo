package Homework7Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bluestone7 {
	public class BlueStone6 {
        @Test
	public void ring()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.bluestone.com/");
		 WebElement search=driver.findElement(By.id("search_query_top_elastic_search"));
	      search.sendKeys("Ring",Keys.ENTER);
	      Thread.sleep(2000);
	      WebElement time=driver.findElement(By.xpath("//a[@title=\"Jewellery with Next Day Delivery\"]"));
	      Actions a=new Actions(driver);
	      a.moveToElement(time).build().perform();
        Thread.sleep(2000);
        WebElement count = (driver.findElement(By.xpath("//ul[@class='product-grid search-box-result']")));
		String size = count.getText();
		Reporter.log(size,true);
	
		driver.close();
		//String delivery = nextDay.getText();
		//Reporter.log(delivery,true);
}
}
}