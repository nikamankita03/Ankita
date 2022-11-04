package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_pop_up
{
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//open flipkart app
		driver.get("https://www.flipkart.com");
		
		// enter email or mob no 
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("nikamanku@gmail.com");
		
		//enter password 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ankita@30");
		
		//click on login 
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}

}
