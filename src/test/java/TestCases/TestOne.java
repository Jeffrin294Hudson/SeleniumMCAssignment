package TestCases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestOne extends BaseTest 

{
 
	@Test(priority=1)	
  public void Solutions() 
	{
		
		
		js = ((JavascriptExecutor) driver);
		
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		  clickMthd("solutions_id");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 iseltpresent("pageelt_Xpath");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
    }
	
}
