package AssertProgram;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ListSoftAssertDemo
{
	public class ListAssertDemo 
	{
	@Test
	public void demo()
	{
		List  lst=new ArrayList();
				lst.add("prasad");
		       lst.add(24);
		       lst.add(true);
		       
		List lst1=new ArrayList<>();
		lst1.add("prasad");
		lst1.add(24);
		lst1.add(true);
		
		SoftAssert sa=new  SoftAssert();
		sa.assertEquals(lst, lst1);
		System.out.println("hellow");
		sa.assertAll();
}
	}
}