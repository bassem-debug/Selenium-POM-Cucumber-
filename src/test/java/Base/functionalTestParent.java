package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class functionalTestParent {
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		driver = new ChromeDriver();
	}
	
	/*@AfterClass
	public static void tearDown(){
	driver.close();
	}	*/
}