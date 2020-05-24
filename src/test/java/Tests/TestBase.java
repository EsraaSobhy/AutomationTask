package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ScreenShot;

public class TestBase {

	protected WebDriver driver;
	@BeforeSuite
  public void OpenURL() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		
  }
	
	@AfterSuite
	public void CloseURL()
	{
		driver.quit();
	}
	
	// take screenshot when test case fail and add it in the Screenshot folder
		@AfterMethod
		public void screenshotOnFailure(ITestResult result) 
		{
			if (result.getStatus() == ITestResult.FAILURE)
			{
				System.out.println("Failed!");
				System.out.println("Taking Screenshot....");
				ScreenShot.captureScreenshot(driver, result.getName());
			}
		}
}
