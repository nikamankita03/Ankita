package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//Enter UN ---->Xpath by contains using Attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address ')]")).sendKeys("abcd1");
		
		//Enter PSW --->Xpath by contais using Text
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy ')]")).sendKeys("9874651abc");
		
		
		
	}
}
