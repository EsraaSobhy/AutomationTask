package Tests;

import org.testng.annotations.Test;

public class APITest extends TestBase
{
	
  @Test
  public void NavigateToAPI() 
  {
	  driver.navigate().to("https://alexwohlbruck.github.io/cat-facts/");
  }
}
