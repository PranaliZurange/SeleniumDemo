package Testing;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBeforeAfterflow 
{
	@BeforeSuite
public void BeforeS()
{
		Reporter.log("BeforeSuite",true);
}
@BeforeTest
public void BeforeT()
{
		Reporter.log("Beforetest",true);
}
	@BeforeClass
	public void BeforeC()
	{
			Reporter.log("BeforeClass",true);
	}
	@BeforeMethod
	public void BeforeM()
	{
			Reporter.log("BeforeMethod",true);
	}
	@Test
	public void Test1()
	{
			Reporter.log("Test1",true);
	}
	@Test
	public void Test2()
	{
			Reporter.log("Test2",true);
	}
	@AfterMethod
	public void AfterM()
	{
		Reporter.log("AfterMethod",true);
	}
	@AfterClass
	public void AfterC()
	{
		Reporter.log("AfterClass",true);
	}
	@AfterTest
	public void AfterT()
	{
		Reporter.log("AfterTest",true);
	}
	@AfterSuite
	public void Afters()
	{
		Reporter.log("AfterSuite",true);
	}
	
}
