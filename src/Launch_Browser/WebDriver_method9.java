package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method9
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
		
		//To get size of the browser
		
		
		
		Dimension S1=driver.manage().window().getSize();//getSize method will go to browser get size of the browser in  Dimension
														// and that dimensions will be stored in S1 object which has Dimension
													   //  return type given at start
		
		System.out.println(S1);// output will be in (width , height) form (Pixel)
		
		
		
		
		
	}

}
