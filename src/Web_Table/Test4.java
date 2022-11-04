package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	//Fetch 300 from  the table
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/Table1.html");
		
		//To fetch value from 3rd row 3rd column(300)
		WebElement Text=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]"));
		
		String S1=Text.getText();
		
		System.out.println(S1);
	}
}
