package AssertProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
@Test
public void demo()
{
	String s1="ABC";
	String s2="ABC";
	Assert.assertEquals(s1, s2);
	System.out.println("valid");
}
}
