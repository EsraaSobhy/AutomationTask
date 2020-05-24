package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch extends PageBase {

	public GoogleSearch(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (name="q")
	WebElement TextBox;
	
	@FindBy(className="gNO89b")
	WebElement SearchButton;
	
	@FindBy(xpath="//*[@id='rso']/div[7]/div/div[1]/a/h3")
	public WebElement ResultText;

	public void search(String searchText)
	{
		TextBox.sendKeys(searchText);
		SearchButton.click();
	}
	
	public void ShowResult()
	{
		System.out.println(ResultText.getText());
	}
}
