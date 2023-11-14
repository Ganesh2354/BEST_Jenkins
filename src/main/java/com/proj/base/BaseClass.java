package com.proj.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.proj.utilities.SeleniumUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public SeleniumUtils utils=new SeleniumUtils();
	public Properties prop;
	public BaseClass()
	{
		String path="C:\\Users\\Ganesh Dandekar\\Eclipse2023-03\\IDE\\"
				+ "eclipse-workspace\\BEST_JenkinsProject\\src\\main\\"
				+ "java\\com\\proj\\config\\props\\config.properties";
		try {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	

	
	@BeforeClass
	public void browserSetup() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("globalURL"));
		Thread.sleep(5000);
		
		
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
