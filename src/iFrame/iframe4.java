package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4
{
	
	public static void main(String [] args ) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		//open url 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame (By  int index   ----- ask index to developer as we dont know index ) 
		driver.switchTo().frame(0); // randomly given the index but we have to ask to developer
		
		// click on - click  on me to display date and time button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}

}
