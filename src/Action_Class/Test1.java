package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//step 1: Identify an Element & Store it into an Object
		WebElement dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		//step 2: Create an Object of Actions Class
		Actions a1=new Actions(driver);
		
		//Step 3: Call the methods
		a1.moveToElement(dropdown).perform();
		
		//wait
		Thread.sleep(2000);

		//Click window option
		driver.findElement(By.xpath("//a[text()='Windows']")).click();

		
	}

}
