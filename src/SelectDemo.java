import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		
		Select s = new Select(drive.findElement(By.cssSelector("select[name='ctl00$mainContent$ddl_Adult']")));
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.selectByValue("6");
		s.selectByVisibleText("9");
	}

}
