package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up2 
{
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter customerid
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("pqr");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		// (selenium focus) To switch to Alert pop_up
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(2000);
		//call the method 
		//1. click cancel button
		alt.dismiss();
		
		
	}

}
