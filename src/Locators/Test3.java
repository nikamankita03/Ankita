package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	public static void main(String [] arsg)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		//open Url/application browser
		 driver.get("https://www.facebook.com");
		 
		 //Click forgotton password link (Xpath by Text)
		 driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		
	}

}
