package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait 
		Thread.sleep(2000);
    
		//to get an application/ To Enter URL
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/name1.html");

		//Enter UserName----> identify path by Name Attribute
		driver.findElement(By.name("1234")).sendKeys("ankita");
			
		//wait 
		Thread.sleep(2000);
				
		//Enter Password----> identify path by Name Attribute
		driver.findElement(By.name("5678")).sendKeys("abcd@123");
		
		
		
	
	}

}
