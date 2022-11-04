package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 
{
	
	public static void main(String [ ] args) throws InterruptedException 
			
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Create object of chromedriver and give reference of webdriver
		WebDriver driver=new ChromeDriver();
		
		//wait 
		Thread.sleep(200);
		
		//open url / application (W3 School --> Tutorial --> Java Script --> Tryit yourself link)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Click on ---> Click me to display Date and Time 
		// driver.findElement(By.xpath("//button[@type='button']")).click();   // it will not click as its frame 
													// and the button present on main page and in the frame refeence is present 
		
		//Switch (focus of selenium ) to frame -->(By string frame name)
		driver.switchTo().frame("iframeResult");
		
		//Click - click me to display Date and Time
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		
	}
	

}
