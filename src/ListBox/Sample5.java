package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/MultiselectableListbox.html");
		
		
	    //Step-I:Identify listbox and store it into an object
		WebElement Multiselectable=driver.findElement(By.xpath("//select[@multiple='true']"));
		
	    //Step-II:Create Object of Select Class
		Select S1=new Select(Multiselectable);
		
	    //Step-III:Call the methods
		S1.selectByVisibleText("Ind");
		
		//wait
		Thread.sleep(1000);
		
		S1.selectByVisibleText("Sri");
		
		//wait
		Thread.sleep(1000);

		S1.selectByVisibleText("Aus");

		//wait
		Thread.sleep(1000);
		
		S1.selectByVisibleText("Pak");
		
		//wait
		Thread.sleep(1000);
		
		//to deselect all the option
		S1.deselectAll();
		
		
		
	}

}
