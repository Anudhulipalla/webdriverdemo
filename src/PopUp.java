import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp 
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver D1 = new ChromeDriver();
		
		D1.manage().window().maximize(); 
		
		D1.get("file:///D:/selenium/VerifyAlerts_Age.html");
		D1.findElement(By.id("idSubGo")).click();
		Thread.sleep(5000);
		Alert X = D1.switchTo().alert();
		System.out.println(X.getText());
						
		X.accept();
		
		D1.close();
	}
}


