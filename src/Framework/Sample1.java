package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	//Without DDF
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Test Case-I:Verify UserName
        
        String ExpectedUserName="Paul Collings";


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
