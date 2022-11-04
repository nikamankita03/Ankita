package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1
{
	public static void main(String [] args) throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//To enter Url
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//To capture Screenshot
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		
		
		// Create Object of File class 
		File Destination = new File("F:\\Screenshot\\.Sample1.jpg");
		
		
		//To move Screenshot
		FileHandler.copy(Source, Destination);
		
	
		
		
	}

}
