package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPIMPage1
{
	//POM 2

	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") private WebElement Username; //private WebElement UserName=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
	
	
	//2. Initialize within a constructor with access level public using pagefactory  
	public OrangeHRMPIMPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. Utilize within a method with access level public
	
	public void VerifyUsername()
	{
		 String ExpectedUsername= "Paul Collings";
		 
		 String ActualUsername =Username.getText();
		 
		 if(ExpectedUsername.equals(ActualUsername))
		 {
			 System.out.println(" Pass ");
		 }
		 else
		 {
			 System.out.println(" Fail ");
 
		 }


	}
	
	

	
	
	
}
