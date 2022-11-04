package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 
{
	//To check whether the listbox is Multiselectable or SingleSelectable
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//Click on Create New Account Button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//wait
		Thread.sleep(5000);
		
	    //Step-I:Identify listbox and store it into an object
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
	    //Step-II:Create Object of Select Class
		Select S1=new Select(month);
		
		//wait
		Thread.sleep(2000);
	    //Step-III:Call the methods
		boolean Result=S1.isMultiple();
		System.out.println(Result);	//false
		
		
	}

}
