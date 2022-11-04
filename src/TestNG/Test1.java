package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1
{
	
	// Test Suit - Test1,Test2,Test3
	
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}

}
