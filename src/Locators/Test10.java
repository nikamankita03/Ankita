package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait 
		Thread.sleep(2000);
    
		//to get an application/ To Enter URL
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/tagname.html");
		
		//Enter UserNmae----> identify path of UserName by tagname locator
		driver.findElement(By.tagName("input")).sendKeys("ankita");
	
		//Enter Password----> identify path of Password by tagname locator
		driver.findElement(By.tagName("input")).sendKeys("abcd123");

	//tagname is same for both UserName & Password field so it will give password in the first element
	
	
	}
}
