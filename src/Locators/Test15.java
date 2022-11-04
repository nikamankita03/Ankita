package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait 
		Thread.sleep(2000);
		
		//to get an application/ To Enter URL
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/class1.html");

		//Enter UserName----> identify path by className Attribute
		driver.findElement(By.className("xyz12")).sendKeys("abcd");
		
		//Enter Password----> identify path by className Attribute
		driver.findElement(By.className("xyz34")).sendKeys("1234@a");
		
		
	}

}
