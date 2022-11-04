package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample8
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/MultiselectableListbox.html");
		Thread.sleep(2000);
		
		//Step 1: Identify Listbox & store it into object
		WebElement MultiselectableListbox=driver.findElement(By.id("1234"));
		
		//Step 2: Create Object of Select class
		Select s1=new Select(MultiselectableListbox);
		Thread.sleep(2000);
		
		//Step 3: Call the methods
		s1.selectByVisibleText("Ind");
		s1.selectByVisibleText("Aus");	
		s1.selectByVisibleText("Sri");
		
		Thread.sleep(2000);
		
		//To get Text
		List<WebElement> s2=s1.getAllSelectedOptions();
		
		for(WebElement s3:s2)
		{
			System.out.println(s3.getText());
			
					//OR
			
			//String s4=s3.getText();
			//System.out.println(s4);
			
			
		}
		
		
		
		
	}

}
