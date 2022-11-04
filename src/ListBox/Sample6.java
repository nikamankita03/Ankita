package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//clicl Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//wait
		Thread.sleep(5000);
		
		//Step 1: Identify object & store it into Object
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2: create object of Select class
		Select S1=new Select(month);
		
		//wait
		Thread.sleep(2000);
		
		//Step 3: call the method
		S1.selectByVisibleText("Mar");
		
		//wait 
		Thread.sleep(2000);
		
		//To get Text 
		WebElement S2=S1.getFirstSelectedOption();
		
		System.out.println(S2.getText());
		
			//OR
		
		//String S3=S2.getText();
		
		//System.out.println(S3);
		
		
	}

}
