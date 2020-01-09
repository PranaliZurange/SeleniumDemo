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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSendExcelData
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
       Thread.sleep(2000);
       driver.get("https://accounts.google.com/");
       Thread.sleep(2000);
 
       FileInputStream fis=new FileInputStream(".//Data/Book1.xlsx");
      	Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Sheet1");
      	Row firstrow=sh.getRow(0);
      	int rowcount=sh.getPhysicalNumberOfRows();
      	
        WebElement email=driver.findElement(By.name("identifier"));
        email.sendKeys(sh.getRow(1).getCell(0).toString());
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(5000);
       
       WebElement pass=driver.findElement(By.name("password"));
       pass.sendKeys(sh.getRow(1).getCell(1).toString());
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Next']")).click();
       
       

	}
	

}
