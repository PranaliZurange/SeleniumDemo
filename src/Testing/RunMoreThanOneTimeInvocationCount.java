package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunMoreThanOneTimeInvocationCount {

	@Test(invocationCount=6)
	public void Demo1()
	{
	Reporter.log("Hi",true);	
	}
	//not allowd 0
	/*@Test(invocationCount=0)
	public void Demo2()
	{
	Reporter.log("Hi",true);	
	}
	//not allowd -1 values
	@Test(invocationCount=-1)
	public void Demo1()
	{
	Reporter.log("Hi",true);	
	}*/
}
