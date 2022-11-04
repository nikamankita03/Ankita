package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method5 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//To enter URL
		driver.get("https://kite.zerodha.com");
		
		//To get the title of webpage
		String Title1=driver.getTitle();  //getTitle method will copy that title of web-page & will store in Title1 object
										 // and the type of the Title is String i.e return type is String
		
		System.out.println(Title1);		//title of the Web-page will print in console
		
		
		
		
		
	}

}
