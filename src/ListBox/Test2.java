package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 
{
	public static void main(String [] args) throws InterruptedException
	{
		//How to handle Listbox
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//wait
		Thread.sleep(2000);
		
		//Open url
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//Click Create new Account Button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//wait
		Thread.sleep(5000);
		
		//Step 1- Identify  listbox and Store it into object
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step 2- Create Object of Select Class
		Select S1=new Select(Month);
		
		//wait
		Thread.sleep(2000);
		
		//Step 3- Call the Methods
		S1.selectByValue("6");
		
		
		
		
	}
}
