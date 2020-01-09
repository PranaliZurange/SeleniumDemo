package ReadFileData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSendExelData {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		  driver.manage().window().maximize();	
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       
       FileInputStream fis=new FileInputStream(".//Data/Book1.xlsx");
   	Workbook wb=WorkbookFactory.create(fis);
   	Sheet sh=wb.getSheet("Sheet1");
   	Row firstrow=sh.getRow(0);
   	int rowcount=sh.getPhysicalNumberOfRows();
       
       
   WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
      email.sendKeys(sh.getRow(4).getCell(0).toString());
      Thread.sleep(2000);
   
 WebElement pass=  driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
     pass.sendKeys(sh.getRow(4).getCell(1).toString());
     Thread.sleep(2000);
     
 WebElement login=driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']"));
    System.out.println(login.getText());
     login.click();
	}

}
