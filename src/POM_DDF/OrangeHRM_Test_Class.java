package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Test_Class 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file=new  	FileInputStream("C:\\Users\\Lenovo\\Desktop\\Software Testing\\book2.xlsx");
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		//Create Object of POM 1
		OrangeHRMLoginPage1	 Login=new 	OrangeHRMLoginPage1(driver);
		String username1=Sh.getRow(0).getCell(0).getStringCellValue();
		Thread.sleep(2000);
		Login.EnterUsername(username1);
		
		String password=Sh.getRow(0).getCell(1).getStringCellValue();
		Thread.sleep(2000);
		Login.EnterPassword(password);
		
		
		Thread.sleep(2000);
		Login.ClickLoginbtn();
		
		
		//Create Object of POM 2
		OrangeHRMPIMPage1 	UserName=new 	OrangeHRMPIMPage1(driver);
		String expectedusername=Sh.getRow(0).getCell(2).getStringCellValue();
		
		 Thread.sleep(2000);
		UserName.VerifyUsername(expectedusername);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
