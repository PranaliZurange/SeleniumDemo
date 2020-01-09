import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBackForword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		System.out.println("Launching Browser");
		Thread.sleep(2000);

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
		//driver.quit();
		System.out.println("Closing browser");


	}

}
