package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 
{
	
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login ",true);
	}

	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Close Browser",true);
	}
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	
	
}
