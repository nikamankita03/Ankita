package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method10
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//to get an application/ To Enter URL
		driver.get("https://www.flipkart.com");
		
		//wait
		Thread.sleep(2000);
		
		//To change position of the browser
		
		Point P1=new Point(100,500);	//x,y
		
		
		driver.manage().window().setPosition(P1);
		
		
		
	}

}
