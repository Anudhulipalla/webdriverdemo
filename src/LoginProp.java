import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProp
{
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver D1 = new ChromeDriver ();
		D1.get("https://opensource-demo.orangehrmlive.com/");
		if (D1.findElement(By.id("btnLogin")).isEnabled())
		{
			System.out.println(" Before Unm/Pwd Login button is enable");
		}
		else
		{
			System.out.println("Before unm/pwd login button is disable");
		}
		D1.findElement(By.id("txtUsername")).sendKeys("Admin");
		D1.findElement(By.id("txtPassword")).sendKeys("admin123");
		if (D1.findElement(By.id("btnLogin")).isEnabled())
		{
			System.out.println("After unm/pwd login button is enable");
		}
		else
		{
			System.out.println("After unm/pwd login button is disable");
		}
		D1.close();
	}

}
