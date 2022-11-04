package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//to get an application/ To Enter URL
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
			
		//To set the size of browser
		
		Dimension  D1=new Dimension(400,900);//Dimension (400,900) will store in D1 object which has Dimension type
											// i.e return type of Dimension(400,900) is Dimension so its mentioned at start
										   //(400,900) 
										   //Width, Height (Pixel)
		driver.manage().window().setSize(D1);//400,900  setSize method will go into D1 object and check for Dimension
		
		
	}

}
