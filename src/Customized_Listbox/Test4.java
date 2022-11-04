package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
		//Click Create new Account Button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		//Step 1- Identify Listbox & store it into Object
		WebElement month=driver.findElement(By.id("month"));
				
		//Step 2- Create Object of Actions Class
		Actions a1=new Actions(driver);
		
		//Step 3- Call the Methods
		a1.click(month).perform();	//Oct -Because Now Oct month is going on or Current month
		Thread.sleep(2000);
		
		a1.sendKeys(Keys.END).perform();
		Thread.sleep(2000);

		//To move to One particular option(May)
		
		for(int i=1;	i<=7; 	i++)
		{
			a1.sendKeys(Keys.ARROW_UP).perform();
			
		}
		
		Thread.sleep(2000);
		//To select that option
		a1.sendKeys(Keys.ENTER).perform();
		
	}

}
