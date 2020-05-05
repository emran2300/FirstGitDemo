import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		//drive.findElement(By.xpath("//input[@value='option1']")).click();
		//System.out.println(drive.findElement(By.xpath("//input[@value='option1']")).isSelected());
		//Thread.sleep(2000);
		//drive.findElement(By.xpath("//input[@value='option1']")).click();
		//System.out.println(drive.findElement(By.xpath("//input[@value='option1']")).isSelected());
		//System.out.println(drive.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		WebElement box = drive.findElement(By.xpath("//input[@value='option1']"));
		box.click();; //check
		Assert.assertTrue(box.isSelected()); //verifies if checked,returns true
		Assert.assertTrue(true);
		System.out.println(box.isSelected());
		
		box.click();
		Assert.assertFalse(box.isSelected()); //verifies if checked,returns true
	    Assert.assertFalse(false);
		System.out.println(box.isSelected());
		
		System.out.println(drive.findElements(By.xpath("//input[@type='checkbox']")).size());
		//drive.findElement(By.)
	}

}
