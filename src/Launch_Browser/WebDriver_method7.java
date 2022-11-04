package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method7
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//To enter URL
		driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(3000);
		
		//To minimize the browser
		driver.manage().window().minimize();
		
		
	
		
	}

}
