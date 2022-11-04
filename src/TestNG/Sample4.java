package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Sample4 
{
	@Test
	public void TC1()
	{
		boolean ActualResult= false;
		
		Assert.assertFalse(ActualResult);  //Pass
		
	}
	
	
	
	@Test
	public void TC2()
	{
		boolean ActualResult= true;
		
		Assert.assertFalse(ActualResult);  //Fail (assertFalse () methhod false asel tr ch Pass hoil nahitr fail  )
		
	}

}
