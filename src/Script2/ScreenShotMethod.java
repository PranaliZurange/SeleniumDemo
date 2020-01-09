package Script2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShotMethod {

	public static void screenshot(WebDriver driver,String name) throws IOException
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenpic=ts.getScreenshotAs(OutputType.FILE);
	 File Screensave=new File(".\\ScreenShot\\"+name+".png");
	 Files.copy(screenpic, Screensave);
	}
	
}



