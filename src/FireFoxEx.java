import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxEx
{
	public static void main(String args[]) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver D1 = new FirefoxDriver();
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
