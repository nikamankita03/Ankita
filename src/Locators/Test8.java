package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//Click create new account button --->Xpath by using text
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//wait 
		Thread.sleep(2000);
		
		//Enter first name ---->Xpath by using index
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ankita");
		
	}

}
