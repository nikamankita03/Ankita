package Pop_Up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Pop_Up
{
	//How to handle Window pop-up/Child Browser Pop-up 
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//click on New Tab button
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		//To get All IDs of webpage
		Set<String> AllIDs=driver.getWindowHandles();	//MianPageID	WindowPopupID
		
		ArrayList<String> ar=new ArrayList<String>(AllIDs);	//MainPageID  	WindowPopUpID
		
		String MainPageID=ar.get(0);
		System.out.println(MainPageID);
		
		String WindowPopUpID=ar.get(1);
		System.out.println(WindowPopUpID);
		
		//Focus of Selenium To switch to WindowPopUp
		driver.switchTo().window(WindowPopUpID);
		
		//wait
		Thread.sleep(5000);
		
		//Click on Training Link
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//wait
		Thread.sleep(5000);
		
		// Focus of Selenium To switch to main page 
		driver.switchTo().window(MainPageID);
		
		//wait
		Thread.sleep(2000);
		
		//Click on new Window button
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
			
		
	}

}
