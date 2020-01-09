package Script2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Uplod {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("http://demo.guru99.com/test/upload/");
     //  Thread.sleep(1000);
    WebElement uplod=  driver.findElement(By.xpath("//div[@id=\"file_wraper0\"]"));
    uplod.click();
    Thread.sleep(2000);
    Runtime rt= Runtime.getRuntime();
    rt.exec("C:\\Users\\Admin\\Desktop\\autoit.exe");
	}
}
