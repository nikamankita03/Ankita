package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1
{
	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}

}
