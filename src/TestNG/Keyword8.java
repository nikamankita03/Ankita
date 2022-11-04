package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword8 
{
	
	  
    @Test                                              //Test Case/Method
    public void Login() 
    {
            Reporter.log("Login TC",true);
    }
    
    @Test(dependsOnMethods={"Login"})               //Test Case/Method
    public void Logout()
    {
            Reporter.log("Logout TC",true);
    }
    

}
