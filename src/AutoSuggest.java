import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.esheba.cnsbd.com/");
		
		WebElement from = drive.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("ki");
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		
		WebElement to = drive.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("dh");
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
		
		drive.findElement(By.id("date")).click();
		drive.findElement(By.cssSelector(".cell.day.selected.today.weekend.sun")).click();
		System.out.println(drive.findElement(By.cssSelector(".cell.day.selected.today.weekend.sun")).isSelected());
		
		

	}

}
