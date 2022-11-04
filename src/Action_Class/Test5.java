package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Step 1- Identify elements & store it into object
		WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		//step2: create object of Action class
		Actions a1=new Actions(driver);
		
		//step 3: call the method (drag & drop)
		a1.dragAndDrop(source, destination).perform();

	}

}
