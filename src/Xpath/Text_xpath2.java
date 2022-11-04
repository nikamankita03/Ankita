package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_xpath2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
	   driver.get("https://kite.zerodha.com");
	   
	   //enter user id (Xpath by attribute )
	   
	  driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ED9140");
	   
	  
	  //Enter password (xpath by attribute)
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ankita90");
	  
	  //click on Login Button
	  driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
 
	   
	}

}
