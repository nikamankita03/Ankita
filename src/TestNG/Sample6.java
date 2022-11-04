package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample6
{
	
	@Test
	public void TC1()
	{
		String str = "abcd";
		
		Assert.assertNotNull(str); 	//Pass
	}
	
	@Test
	public void TC2()
	{
		String str =null;
		
		Assert.assertNotNull(str);  //fail (Jar value nasel tr fail honar) 
		
	}
	

}
