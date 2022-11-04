package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\\\chromedriver_win32\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		
		//open Url/application browser
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//Click Login Button (Xpath by text)
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		
	}

}
