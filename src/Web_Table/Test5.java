package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5
{
	//To Fetch all yhe data of 2nd Row
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/Table1.html");
		
		for(int i=1;  i<=3;  i++)
		{
			WebElement S1=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td  ["+  i  +"]"  	  ));
														//LHS String               // "+ VAriable +      // RHS String
			
			String Text=S1.getText();
			
			System.out.print(Text + "  ");
						   //space between data
			
		}
		
	}
}
