package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method4 
{
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//Click Create New Account Button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(4000);
		
		//verify radio button is selected or not
		WebElement radio=driver.findElement(By.xpath("//label[text()='Female']"));
		
		 boolean S1=radio.isSelected();
		
		 System.out.println(S1);
		
		
	}


}
