package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestSix extends BaseTest {
  @Test(priority=6)
  public void Blog() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  clickMthd("Blog_Xpath");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // Assert.fail("Write your custom error message");
	  
  }
}
