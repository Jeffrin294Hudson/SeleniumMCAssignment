package TestCases;

import java.util.concurrent.TimeUnit;



import org.testng.annotations.Test;

import base.BaseTest;

public class TestTwo extends BaseTest{
  @Test(priority=2)	
  public void Api() {
	 /* js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("api_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 iseltpresent("security_Xpath");
	 
  }
}
