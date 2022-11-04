package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method3 
{
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		 WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
		
		boolean s1=login.isEnabled();
		
		System.out.println(s1);
		
	}

}
