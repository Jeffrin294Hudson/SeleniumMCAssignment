package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestSeven extends BaseTest {
  @Test(priority=7)
  public void Support() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("Support_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
}
