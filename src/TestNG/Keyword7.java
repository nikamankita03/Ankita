package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword7
{
	 @Test(timeOut=4000)                                              //Test Case/Method
     public void TC1() throws InterruptedException
     {
             Thread.sleep(5000);
             Reporter.log("Running TC1",true);
     }
     
     @Test                                              //Test Case/Method
     public void TC2()
     {
             Reporter.log("Running TC2",true);
     }

}
