import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class WebElementEx 
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver D1 = new ChromeDriver();
						
		D1.get("https://opensource-demo.orangehrmlive.com/");
					
		WebElement unm = D1.findElement(By.id("txtUsername"));
		
		if(unm.isEnabled())  // isEnable Returns True Or False
			{
			System.out.println("UserName In Enable");
			unm.sendKeys("Admin");
			}
		else
			System.out.println("UserName In Disable");
		
		
		
								
		D1.close();  // Or d1.quit()  To Close Browser
		
	}
}
