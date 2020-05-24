package Pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fileupload extends PageBase{

	public Fileupload(WebDriver driver) {
		super(driver);
	}
	
	/*@FindBy (linkText="File Upload")
	
	WebElement FileUpload;*/
	
	@FindBy (id="file-upload")
	WebElement chooseFileBtn;
	
	@FindBy (id="file-submit")
	WebElement UploadButton;
	
	@FindBy (className="example")
	public WebElement SuccessMessage;
	 public  void ChooseFileUpload1() throws AWTException 
	 {
		 chooseFileBtn.click();
		 Robot robot=new Robot();
		  robot.setAutoDelay(20);
		  StringSelection image=new StringSelection("C:\\Users\\Max\\workspace\\AutomatioTask\\image\\jerry.jpg");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(image,null);
		  robot.setAutoDelay(10000);
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);	  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.setAutoDelay(10000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
	 }
	 
	 
	 public  void ChooseFileUpload2() 
	 {
		 chooseFileBtn.sendKeys("C:\\Users\\Max\\workspace\\AutomatioTask\\image\\jerry.jpg");
	 }
	 
	 public void UploadFile()
	 {
		 UploadButton.click();
	 }
	 
	

}
