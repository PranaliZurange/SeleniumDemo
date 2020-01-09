package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCopyXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
		String name = email.getText();//gettext()is used to get the inner text in console
		System.out.println(name);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);

		WebElement pass = driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pass.getText());
	}

}
