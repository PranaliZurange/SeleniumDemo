package TestNgItestLisner;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GoogleList implements ITestListener{
	static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("onTestFailedButWithinSuccessPercentage");
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println(result.getName());
		System.out.println(result.getStatus());

	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println(context.getStartDate());
		System.out.println(context.getAllTestMethods().toString());
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println(context.getEndDate());
		System.out.println(context.getPassedTests());
		System.out.println(context.getFailedTests());
		
	}

}