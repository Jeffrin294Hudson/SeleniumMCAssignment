package Rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static boolean elementPresent()
	{
		//driver = new ChromeDriver();
		driver.findElement(By.xpath("//p[@data-uid='merchant-match-plus_learnMore']"));
		System.out.println("page loaded");
		return true;
	}
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://developer.mastercard.com/");
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@id='navPrimaryNewAndExperimental']")).click();
		WebElement elem =  driver.findElement(By.xpath("//*[@id=\"content\"]/section/section/div/section/div/section/div/h1"));
		  boolean x = elem.isDisplayed();
		  
		  System.out.println(x);
		 
		//OpenBrowser.elementPresent();
		
		
	}

}
