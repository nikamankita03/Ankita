package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//get url / open application
		 driver.get("https://www.facebook.com");

		 //Click Create new Account button(Xpath by Text)
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		
		
		
		
	}

}
