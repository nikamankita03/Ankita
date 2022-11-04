package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_xpath1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://kite.zerodha.com");
		
		// Enter password on zerodha page
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234abc");
		
	}

}
