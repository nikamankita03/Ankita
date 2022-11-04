package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method4 
{

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(1000);
		
		//To open an application/Enter URL 
		driver.navigate().to("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//To open an application / Enter URL
		driver.navigate().to("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
		
		//to move backward
		driver.navigate().back();
		
		//wait		
		Thread.sleep(2000);
		
		//to move forward
		driver.navigate().forward();
		
		//wait
		Thread.sleep(2000);
		
		//To refresh webpage
		driver.navigate().refresh();
		
		
		
		
	}
}
