package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//to close the hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//Identify search field & Enter - "redmi note 10s" in the field 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
		
		Thread.sleep(2000);
		
		//to click on search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		//Identify Rating Element
		WebElement Rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
		
		System.out.println(Rating.getText());
		
					//OR
		
		//String RatingText=Rating.getText();
		//System.out.println(RatingText);
		
		
	}

}
