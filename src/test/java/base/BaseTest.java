package base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	
	
	
	public static boolean  iseltpresent(String elt)
	{
		  if (elt.endsWith("_Xpath"))
		  {
			  driver.findElement(By.xpath(OR.getProperty(elt)));
		  }
		  else if (elt.endsWith("_id"))
		  {
			  driver.findElement(By.id(OR.getProperty(elt)));
		  }
		  
		  return true;
		  
	}
	
  public static void  clickMthd(String elt) {
	  
	  if (elt.endsWith("_Xpath"))
	  {
		  driver.findElement(By.xpath(OR.getProperty(elt))).click();
	  }
	  else if (elt.endsWith("_id"))
	  {
		  driver.findElement(By.id(OR.getProperty(elt))).click();
	  }
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  if(driver==null) {
	  try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	  
	  WebDriverManager.chromedriver().setup();
	  	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(OR.getProperty("URL"));
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
  
 
}
