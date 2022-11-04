package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	//  With DDF
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 //To reach Upto Excelsheet
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Software Testing\\Sheet1.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet3");
		
		 //Enter UN
        String Username=Sh.getRow(0).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username); //Admin
        
      //wait
       Thread.sleep(2000);
       
       //Enter Password
       String Password=Sh.getRow(0).getCell(1).getStringCellValue();
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);  //admin123
        
              //wait
       Thread.sleep(2000);
       
       //click login Button
       driver.findElement(By.xpath("//button[text()=' Login ']")).click();
       
       
       
       //Test Case-I:Verify UserName
       
         String ExpectedUserName=Sh.getRow(0).getCell(2).getStringCellValue();


         WebElement Address=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
       
         String  ActualUserName=Address.getText();
         
        //Paul Collings            //Paul Collings
        if(ExpectedUserName.equals(ActualUserName))
        {
                System.out.println("Pass");
        }
        else 
        {
                System.out.println("Fail"); 
        }
        
        driver.close();
      
         
      }

		
		
		
		
		
	}


