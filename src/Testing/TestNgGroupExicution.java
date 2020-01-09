package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgGroupExicution {
	@Test(groups="smoke",priority=3)
public void demo()
{
		Reporter.log("Hi",true);
}
	@Test(groups="functional",dependsOnGroups="smoke")
	public void demo1()
	{
			Reporter.log("Hi1",true);
	}
	@Test(groups="smoke")
	public void demo2()
	{
			Reporter.log("Hi2",true);
	}
	@Test(groups="functional",dependsOnGroups="smoke",priority=1)
	public void demo3()
	{
			Reporter.log("Hi3",true);
	}
	@Test(groups="smoke",priority=2)
	public void demo4()
	{
			Reporter.log("Hi4",true);
	}
	@Test(groups="system",dependsOnGroups="functional")
	public void demo5()
	{
			Reporter.log("Hi5",true);
	}
}
