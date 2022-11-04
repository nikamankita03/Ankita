package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approach2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//wait
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//Enter UserNmae
		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		
		UserName.sendKeys("abc");
		
		//wait
		Thread.sleep(2000);
		
		//Clear UserName
		UserName.clear();
		
		//wait
		Thread.sleep(2000);
		
		//Enter UserName
		UserName.sendKeys("ankita");
		
		
	}
}
