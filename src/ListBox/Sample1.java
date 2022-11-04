package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1
{
	//To check whether the listbox is Multiselectable or SingleSelectable
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/MultiselectableListbox.html");
		
	    //Step-I:Identify listbox and store it into an object
		WebElement MultiSelectable=driver.findElement(By.xpath("//select[@multiple='true']"));
		
	    //Step-II:Create Object of Select Class
		Select S1=new Select(MultiSelectable);
		
	    //Step-III:Call the methods
		boolean S2=S1.isMultiple();
		
		System.out.println(S2);	//true
		
	}

}
