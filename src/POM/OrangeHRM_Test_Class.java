package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Test_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Create Object of POM 1
		OrangeHRMLoginPage1	 Login=new 	OrangeHRMLoginPage1(driver);
		
		Thread.sleep(2000);
		Login.EnterUsername();
		
		Thread.sleep(2000);
		Login.EnterPassword();
		
		Thread.sleep(2000);
		Login.ClickLoginbtn();
		
		
		//Create Object of POM 2
		OrangeHRMPIMPage1 	UserName=new 	OrangeHRMPIMPage1(driver);
		
		 Thread.sleep(2000);
		UserName.VerifyUsername();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
