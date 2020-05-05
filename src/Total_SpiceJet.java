import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Total_SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/flights"); //URL in the browser
		driver.findElement(By.xpath("//div[@data-reactid='167'] //input[@id='text-box']")).click();
		driver.findElement(By.xpath("//div[@data-reactid='167'] //input[@id='text-box']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[@data-reactid='167'] //input[@id='text-box']")).sendKeys(Keys.ARROW_DOWN);

		
	
	
   }
}


