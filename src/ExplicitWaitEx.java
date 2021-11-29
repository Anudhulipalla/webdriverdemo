import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx 
{
	public static void main(String args[]) throws Exception
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
		
		//Thread.sleep(5000);
		
		WebDriverWait x = new WebDriverWait(D1,100);
		x.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		D1.findElement(By.linkText("Logout")).click();
			
		D1.close(); 
		
	}
}
