package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class drawback_of_hardassert
{
	
	@Test
	public void TC1()
	{
		String s1="Hi";
		
		String s2="Hello";
		
		String s3="Good Morning";
		
		Assert.assertNotEquals(s2, s3);	 //Pass
		
		Assert.assertEquals(s2, s1);	//Fail (Hard Assert mde jr ek assertion fail zal tr next assertions execute ch hot nahit)
		
		Assert.assertEquals(s3, s1);   //Fail      <---- tymule he execute honarch nahi 
		
		Assert.assertNotEquals(s1,s3);	//Pass	   <---- tymule he execute honarch nahi
		
		
	}

}
