package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		//step1 : Identify an element & store it into object
		WebElement C1=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		//step 2: create object of Actions Class
		Actions A1=new Actions(driver);
		
		//Step 3: call the methods (double click)
		A1.doubleClick(C1).perform();
		
		
		
		
	}

}
