package Web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/Lenovo/Desktop/Software%20Testing/Automation/Table1.html");
		
		//Find Column Size			alternate xpath		   //-"//table[@id='1234']//tr[4]/td"
		List<WebElement> Column=driver.findElements(By.xpath("//table[@id='1234']//tr/th"));
		
		int  S1=Column.size();
		
		System.out.println(S1);
		
	}
}
