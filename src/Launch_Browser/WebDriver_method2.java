package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(5000);
		
		//To open an application/Enter URL
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(3000);
		
		//To close current tab of the browser
		driver.close();
		
	}

}
