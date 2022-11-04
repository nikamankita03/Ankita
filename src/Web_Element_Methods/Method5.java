package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method5 
{
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//Verify Facebook is displayed or not
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		boolean S1=logo.isDisplayed();
		
		System.out.println(S1);
		
	}

}
