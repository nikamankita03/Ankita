package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);

		//step 1: Identify an Element & Store it into an Object
		WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
		
		//step 2: create object of Action class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);

		
		//Step 3: call the methods (Left Click ) 
		act.click(cart).perform();
		
	}

}
