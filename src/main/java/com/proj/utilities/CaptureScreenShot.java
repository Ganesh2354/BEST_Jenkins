package com.proj.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	private static String screenshotPath;
	
	public static void setScreenshotPath(String path)
	{
		screenshotPath=path;
	}
	
	public static String getscreenshotPath()
	{
		return screenshotPath;
	}
	
	
	public static void getScreenShotOfPage(WebDriver ld, String ssName) {
		try {
			File source = ((TakesScreenshot) ld).getScreenshotAs(OutputType.FILE);
			// Path
			String path = "C:\\Users\\Ganesh Dandekar\\Eclipse2023-03\\IDE\\eclipse-workspace\\"
					+ "BEST_JenkinsProject\\src\\main\\java\\ScreenShots_Scripts\\"+ssName+ ".png";
			setScreenshotPath(path);
			File destination = new File(path);
			// To take the screen shot from source and store in destination
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
