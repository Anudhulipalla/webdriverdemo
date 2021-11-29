

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox 
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver D1 = new ChromeDriver();
		
		D1.manage().window().maximize(); 
		
		D1.get("file:///C:/selenium/checkbox.html");
			
		
		D1.findElement(By.xpath("//input[@value='yellow']")).click();  // Select The CheckBox Button
		
		D1.findElement(By.xpath("//input[@name='color'][1]")).click(); 
		
		Thread.sleep(5000);
		
		D1.close();  // Or d1.quit()  To Close Browser
		
	}
}

