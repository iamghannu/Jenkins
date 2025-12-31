package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGoogle {

	WebDriver driver;
	@Parameters("browserName")
	@Test
	public void verifyTitle(String browserName)
	{
		System.out.println("browserName is "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
			 System.out.println("chrome browser");
		}
		else {
			driver = new EdgeDriver();
			System.out.println("edge browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google","Wrong Title");
	    driver.quit();
	}
}
