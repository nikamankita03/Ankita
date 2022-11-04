package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approach1 
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
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		//wait
		Thread.sleep(2000);
		
		//clear Username
		driver.findElement(By.xpath("//input[@id='email']")).clear();

		//wait
		Thread.sleep(2000);
		
		//Enter UserNmae
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankita");
		
		
		
	}

}
