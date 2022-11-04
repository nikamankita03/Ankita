package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample5
{
	@Test
	public void TC1()
	{
		String str=null;
		
		Assert.assertNull(str); //Pass
		
	}
	
	
	@Test
	public void TC2()
	{
		String str="abcd";
		
		Assert.assertNull(str); //Fail  (assertNull() method value milali tr fail hoil)
		
	}

}
