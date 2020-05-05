import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create chrome driver
		System.setProperty("webdriver.chromr.driver", "C:\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://google.com");
		System.out.println(drive.getTitle()); // get title.......
		System.out.println(drive.getCurrentUrl());//get title.....
		//System.out.println(drive.getPageSource()); // get page source......
		
		drive.get("https://aiub.edu");
		drive.navigate().back();  // back again main website........
		drive.navigate().forward();    //forword again ......
		drive.close();    //close current browser .....
		drive.quit();     //close all browser open by selenium.....
		
	}

}
