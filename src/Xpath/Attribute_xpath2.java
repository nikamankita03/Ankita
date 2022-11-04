package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_xpath2
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://www.flipkart.com");
		
		// Enter name flipkart search field
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	
	}
	

}
