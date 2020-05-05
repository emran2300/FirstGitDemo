import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://portal.aiub.edu");
		//drive.findElement(By.id("email")).sendKeys("AIUB id");
		//drive.findElement(By.id("pass")).sendKeys("Password");
		drive.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("19-41204-2");
		drive.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("48495375");
		
		drive.findElement(By.xpath("//*[@id=\'bs-example-navbar-collapse-00000000-0000-0000-0000-000000000000\']/ul[2]/li/p/a/small")).click();
	}

}
