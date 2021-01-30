
package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestFive extends BaseTest{
  @Test(priority=5)
  public void CaseStudies() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("CaseStudies_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 iseltpresent("CaseStudiesElt_Xpath");
	 
  }
}
