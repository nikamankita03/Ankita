package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	
	//To fetch particular value from the table
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/Table1.html");
		
		//To fetch value from 3rd row 2nd column(Java)
		WebElement Text=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]"));
		
		String S1=Text.getText();
		
		System.out.println(S1);
		
	}
}
