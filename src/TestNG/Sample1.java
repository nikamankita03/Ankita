package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1
{
	@Test
	public void TC1()
	{
		String ExpectedResult = "Hi";
		
		String ActualResult = "Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult);	//Pass
		
	}
	
	
	@Test
	public void TC2()
	{
		
		String ExpectedResult ="Hi";
		
		String ActualResult="Hello";
		
		Assert.assertEquals(ActualResult, ExpectedResult);	//Fail
		
	}
	
	
	

}
