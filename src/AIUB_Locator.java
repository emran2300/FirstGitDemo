import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AIUB_Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com/");
		drive.findElement(By.cssSelector("input[type='email']")).sendKeys("emranmho");
		drive.findElement(By.cssSelector("input[name='pass']")).sendKeys("mhoemr@n");
		//drive.findElement(By.cssSelector("input[type='password']")).sendKeys("48495375");
		drive.findElement(By.cssSelector("input[value='Log In']")).click();
		//drive.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-00000000-0000-0000-0000-000000000000']/ul[2]/li/p/a/small")).click();
		//drive.findElement(By.cssSelector("span[class='fa fa-sign-out']")).click();
		//drive.close();
	}

}
