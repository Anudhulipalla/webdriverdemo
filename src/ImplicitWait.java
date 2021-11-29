// The implicit wait will tell to the web driver to wait for certain amount of time before it throws a "No Such Element Exception". The default setting is 0. Once we set the time, web driver will wait for that time before throwing an exception.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait 
{
	public static void main(String args[])throws Exception
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver D1 = new ChromeDriver();
		
		D1.get("https://opensource-demo.orangehrmlive.com/");
		
		D1.findElement(By.id("txtUsername")).sendKeys("Admin");
				
		D1.findElement(By.id("txtPassword")).sendKeys("admin123");
				
				
		D1.findElement(By.id("btnLogin")).click();
		// Thread.sleep(5000);
		
		D1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;  // It Works Like Wait For PageToLoad
		
		D1.findElement(By.id("welcome")).click();
		
		Thread.sleep(5000);
		
		D1.findElement(By.linkText("Logout")).click();
			
		D1.close(); 
		
	}
}
