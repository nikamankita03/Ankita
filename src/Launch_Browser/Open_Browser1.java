package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser1 
{
	//how to launch / open browser/how to communicate with browser
	public static void main(String [] args)
	{
		
		//Parameter-1: Name of the Browser (small letters)
		//Parameter-2: Path of the Browser(ChromeDriver.exe file) (Convert '\' to '\\' single slash to double slash)
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of ChromeDriver class 	
		ChromeDriver driver=new ChromeDriver(); // ClassName objectNamen=new ClassName();
		
	}

}
