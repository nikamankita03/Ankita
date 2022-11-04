package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method6 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//To enter URL
		driver.get("https://kite.zerodha.com");
		
		//To get current URL
		 String URL=driver.getCurrentUrl();	//getCurrentUrl method will copy the Url of web-page & will store in URL object
		 								   // and the type of the URL is String i.e return type is String
		 
		System.out.println(URL);	//Current URL will be print in Console
		
		
		
		
	}
}
