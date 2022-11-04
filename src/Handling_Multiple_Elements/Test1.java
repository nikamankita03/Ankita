package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//To Identify all Links on Facebook login page
		List<WebElement> AllLinks =driver.findElements(By.xpath("//a"));
		
		//to get text of all the links 
		for(WebElement Link:AllLinks)
		{
			System.out.println(Link.getText());
		}
		
		
	}

}
