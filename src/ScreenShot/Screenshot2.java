package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 
{
	public static void main(String[]args) throws InterruptedException, IOException
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
   	  //Create object of ChromeDriver class 	
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		//To open Url / Application
		driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
		
		//To capture Screenshot
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		System.out.println(source);

		//To create object of file class
		File Destination=new File("F:\\Screenshot\\.Sample2.jpg");
		FileHandler.copy(source, Destination);

		
	}

}
