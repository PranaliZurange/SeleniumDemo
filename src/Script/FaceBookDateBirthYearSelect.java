package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDateBirthYearSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
	  Select s = new Select(day);
		List<WebElement> days = s.getOptions();
		if (s.isMultiple())
			for (WebElement data : days) {
				System.out.println(data.getText());
				s.selectByValue(data.getText());
			}
		else {
			for (WebElement data : days) {
				System.out.println(data.getText());
			}
		}
Thread.sleep(1000);
	 WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	 Select m = new Select(month);
		List<WebElement>months  = m.getOptions();
		if (m.isMultiple())
			for (WebElement datas : months) {
				System.out.println(datas.getText());
				m.selectByValue(datas.getText());
			}
		else {
			for (WebElement datas : months) {
				System.out.println(datas.getText());
			}
		}
		 Thread.sleep(1000);
		 WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		 Select y=new Select(year);
		 List<WebElement>years  = y.getOptions();
			if (y.isMultiple())
				for (WebElement datass :years) {
					System.out.println(datass.getText());
					y.selectByValue(datass.getText());
				}
			else {
				for (WebElement datass : years) {
					System.out.println(datass.getText());
				}
			}
		Thread.sleep(1000);
		 
	}

}
