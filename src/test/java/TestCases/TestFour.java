package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestFour extends BaseTest{
  @Test(priority=4)
  public void PartnerProgram() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("PrtnrPgm_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 iseltpresent("PrtnrElt_Xpath");
	 
  }
}
