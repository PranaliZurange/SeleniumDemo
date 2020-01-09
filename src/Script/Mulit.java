package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
	   System.out.println("Launching browser");
	    driver.get("C:\\Users\\Admin\\Desktop\\selenium\\drop.html");
	    Thread.sleep(2000);
       WebElement opt=driver.findElement(By.xpath("//select[@id='b']"));
      Select s=new Select(opt);
      List<WebElement> values=s.getOptions();
      if(s.isMultiple())
      for(WebElement data:values)
      {
    	  System.out.println(data.getText());
    	  s.selectByValue(data.getText());
      }
      Thread.sleep(2000);
      System.out.println("========="+s.getFirstSelectedOption().getText());
      List<WebElement> selectotp=s.getAllSelectedOptions();
       for(WebElement val:selectotp)
       {
    	   System.out.println(val.getText());
    	 //  s.deselectByValue(val.getText());
       }
       s.deselectAll();
     /* WebElement ooo=driver.findElement(By.xpath("//select[@id='a']"));
      Select a=new Select(ooo);
      List<WebElement> value=a.getOptions();
      for(WebElement datas:value)
      {
    	  System.out.println(datas.getText());
      }*/
	}

}
