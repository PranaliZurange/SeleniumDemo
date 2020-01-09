package AssertProgram;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{
@Test	
public void user()
{
	String Et="ankur.fb.com";
	String At="ankur.fb.com";
	Assert.assertEquals(At,Et);
	System.out.println("Actual is matching in  expected title");
	boolean Ex=true;
	boolean Ax=true;
	Assert.assertEquals(Ex, At);
	System.out.println("Actual is matching with expected title");
	Set<String> s=new HashSet<>();
	
	
	
}

}
