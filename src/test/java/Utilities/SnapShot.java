package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseTest;

public class SnapShot extends BaseTest{

public static String takeScreenShot(String screenShotName) throws IOException {
        
        //create a string variable which will be unique always
        String df = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
        
        //create object variable of TakeScreenshot class  
        TakesScreenshot ts = (TakesScreenshot)driver;
     
        //TakesScreenshot ts =new ChromeDriver();
        //create File object variable which holds the screen shot reference 
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder 
        String path = System.getProperty("user.dir") + "\\reports\\" + screenShotName + df + ".png";
        
        //create another File object variable which points(refer) to the above stored path variable
        File destination = new File(path);
        
        //use FileUtils class method to save the screen shot at desired path
        FileUtils.copyFile(source, destination);
        
        //return the path where the screen shot is saved 
        return path;
}}
