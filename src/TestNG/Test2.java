package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
	
	// Test Suit - Test1,Test2,Test3
	
	@Test
	public void TC3()
	{
		//Assert.fail();
		Reporter.log("Running TC3",true);
	}
	
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}

}
