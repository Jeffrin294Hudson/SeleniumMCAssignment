package Rough;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=1)	
  public void scrollTest() {
	  ChromeDriver driver = new ChromeDriver();
	  JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test(priority=2)	
  public void solutionTest() {
	  ChromeDriver driver = new ChromeDriver();
	  driver.findElement(By.xpath("//a[@id='navPrimaryApis']")).click();
	  
	  WebElement elem =  driver.findElement(By.xpath("//p[@data-uid='merchant-match-plus_learnMore']"));
	  boolean x = elem.isDisplayed();
	  
	  System.out.println(x);
  }
  
  
  
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://developer.mastercard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void afterSuite() {
	  ChromeDriver driver = new ChromeDriver();
	  driver.quit();
  }

}
