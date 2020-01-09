import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLanuch
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();//upcasting
		System.out.println("Launching Browser");
		Thread.sleep(2000);
		//driver.get("https://selenium.dev/"); //lanuch the browser we an use get method or nevigate method
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Loding url");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		System.out.println("Closing browser");

	}

}
