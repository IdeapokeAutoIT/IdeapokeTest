package com.ideapoke.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ideapoke.qa.base.TestBase;

public class testutil extends TestBase {

	public static void CaptureScreenshot(WebDriver driver , String Screenshotname)
	{
		try {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File source=  ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+Screenshotname+".png"));
		} catch (Exception e) {
			System.out.println("exception while taking screenshot"+e.getMessage());
		
		}
	}
	
}
