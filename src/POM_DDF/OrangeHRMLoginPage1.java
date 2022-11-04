package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage1 
{
	//POM 1
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//input[@name='username']") private WebElement UN;  //private WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));
	
	@FindBy(xpath="//input[@name='password']") private WebElement PSW;	//private WebElement PSW=driver.findElement(By.xpath("//input[@name='password']"));	
	
	@FindBy(xpath="//button[@type='submit']") private WebElement Login; //private WebElement LoginBtn=driver.findElement(By.xpath("//button[text()=' Login ']"));
	
	
	//2. Initialize within a constructor with access level public using pagefactory  
	
	public OrangeHRMLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. Utilize within a method with access level public
	public void EnterUsername(String username1)
	{
		UN.sendKeys(username1);
	}
	
	
	public void EnterPassword(String password)
	{
		PSW.sendKeys(password);
	}
	
	
	public void ClickLoginbtn()
	{
		Login.click();
	}
	
	
	
	

}
