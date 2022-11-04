package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample10
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//clicl Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//wait
		Thread.sleep(5000);
		
		//Step 1: Identify object & store it into Object
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2: create object of Select class
		Select S1=new Select(month);
		
		//Step 3: Call the methods
		// Select all the Options and Print all in Console
		List<WebElement> S2=S1.getOptions();
		
		for(WebElement S3:S2)
		{
			System.out.println(S3.getText());
			
		}
		
	}

}
