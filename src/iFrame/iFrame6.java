package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame6 
{
	
	
	public static void main(String [] args ) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		//open url 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame (By  String frame id )
		driver.switchTo().frame("iframeResult");
		
		// click on - click  on me to display date and time button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait 
		Thread.sleep(2000);
		
		//switch to main page 
		driver.switchTo().parentFrame();
		
		//wait 
		Thread.sleep(2000);
		
		//click on home button symbol
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	
		
	}


}
