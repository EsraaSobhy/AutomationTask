package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoading extends PageBase
{

	public DynamicLoading(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Dynamic Loading")
	WebElement selectDynamicLoading;
	
	@FindBy(linkText="Example 2: Element rendered after the fact")
	WebElement Example2;
	
	@FindBy(xpath="//*[@id='start']/button")
	WebElement StartButton;
	
	@FindBy(id="finish")
	public WebElement LoadMessage;
	
	public void ExampleLoad()
	{
		selectDynamicLoading.click();
		Example2.click();
		StartButton.click();
	}
}
