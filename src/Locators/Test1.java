package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
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
		
		//enter username (Xpath by Attribute)
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		//Enter Password(Xpath by Attribute)
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		
		
		
		
	}

}
