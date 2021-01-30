package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestThree extends BaseTest {
  @Test(priority=3)	
  public void NewAndExperiment() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("Exprmnt_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 iseltpresent("CheckExpElt_Xpath");
	 
  }
}
