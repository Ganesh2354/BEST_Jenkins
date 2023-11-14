package com.proj.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	
	public void click(WebDriver ld,WebElement elem, String elemName)
	{
		WebDriverWait wait=new WebDriverWait(ld, 30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elem));
		System.out.println("clicking on element...");
		element.click();
		System.out.println("clicked on element: "+elemName);
	}
	
	public void click(WebDriver ld,String path, String elemName)
	{
		WebDriverWait wait=new WebDriverWait(ld, 30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
		System.out.println("clicking on element...");
		element.click();
		System.out.println("clicked on element: "+elemName);
	}
	
	public void enterText(WebDriver ld,String path, String elemName, String value)
	{
		WebDriverWait wait=new WebDriverWait(ld, 30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
		System.out.println("entering text...");
		element.sendKeys(value);
		System.out.println("entered text in element: "+elemName+" and value is: "+value);
	}
	
	public void enterText(WebDriver ld,WebElement elem, String elemName, String value)
	{
		WebDriverWait wait=new WebDriverWait(ld, 30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elem));
		System.out.println("entering text...");
		element.sendKeys(value);
		System.out.println("entered text in element: "+elemName+" and value is: "+value);
	}
}