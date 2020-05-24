package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import Pages.GoogleSearch;
import Pages.Fileupload;
import Pages.DynamicLoading;

public class TestCases extends TestBase{ 
	
	GoogleSearch GoogleSearchObject;
	Fileupload UploadObject;
	DynamicLoading DLobject;
	
  @Test(priority=1)
  public void SeleniumSearch() {
	  
	  GoogleSearchObject=new GoogleSearch(driver);
      GoogleSearchObject.search("selenium webdriver");
		  
  }
  
  @Test(priority=2,dependsOnMethods={"SeleniumSearch"})
  public void resultCheck()
  {
	  GoogleSearchObject.ShowResult();
	  
  }
  
  @Test(priority=3)
  public void NavigateToHero()
  {
	  driver.navigate().to("https://the-internet.herokuapp.com/upload");
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
  }
  
  @Test(priority=4)
  public void TestFileUpload() throws AWTException 
  {
	  UploadObject=new Fileupload(driver);

	  //UploadObject.ChooseFileUpload1();
	  UploadObject.ChooseFileUpload2();
	  UploadObject.UploadFile();
	String Text=UploadObject.SuccessMessage.getText();
	Assert.assertTrue(Text.contains("File Uploaded!"), "File Uploaded!");
	 System.out.println(Text);

  }
  
  @Test(priority=5)
  public void NavigateBack()
  {
	  driver.navigate().to("https://the-internet.herokuapp.com/");
  }
  
  @Test (priority=6)
  public void TestDynamicLoading()
  {
	  DLobject= new DynamicLoading (driver);
	  DLobject.ExampleLoad();
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  String Message=DLobject.LoadMessage.getText();
		Assert.assertTrue(Message.contains("Hello World!"));
		System.out.println(Message);

  }
}
