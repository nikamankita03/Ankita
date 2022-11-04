package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method3
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(3000);
		
		//To open an apllication / Enter URL
		driver.get("https://www.facebook.com");
		//wait
		Thread.sleep(3000);
		
		driver.get("https://www.google.com");
		
		//wait
		Thread.sleep(3000);
		
		//To close multiple tab of the browser / to close browser
		driver.quit();
	}

}
