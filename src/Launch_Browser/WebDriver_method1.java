package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		//wait 5 sec
		Thread.sleep(5000);
		
		//To enter Url
		Driver.get("https://www.google.com");		//Objectname.methodname();
		
		
	}

}
