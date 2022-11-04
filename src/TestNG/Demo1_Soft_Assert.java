package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1_Soft_Assert
{
	
	@Test
	public void TC1()
	{
		//Create Object of Soft Assert Class
		SoftAssert  soft=new  SoftAssert();
		
		String s1="Hi";
		
		String s2="Hello";
		
		String s3="Good Morning";
		
		soft.assertEquals(s1, s2);	//fail  (jari assertion fail zal tari pudche  sgle assertions execute hotil  
																		//  he advantage ahe SoftAssert class ch )
		
		soft.assertNotEquals(s1, s2); //Pass
		
		soft.assertEquals(s3, s1);	//fail
		
		soft.assertNotEquals(s1, s3);	//Pass
		
		soft.assertAll();
		
		//console mde fkt fail assertions ch rzn n msg asto Passed assertion ch msg kdich dist nahi console mde 
	}
	
	
}
