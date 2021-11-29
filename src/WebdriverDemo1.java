import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverDemo1
{
	public static void main (String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver D1 = new ChromeDriver();
		D1.manage().window().maximize();
		D1.get("https://opensource-demo.orangehrmlive.com/");
		D1.findElement(By.id("txtUsername")).sendKeys("Admin");
		D1.findElement(By.id("txtPassword")).sendKeys("admin123");
		D1.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		D1.findElement(By.id("Welcome")).click();
		Thread.sleep(5000);
		D1.findElement(By.linkText("Logout")).click();
		D1.close();
	
		
	}

}
