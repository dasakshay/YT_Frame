package org.testing.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
{
	
	@Test
	public void SigninTrending() throws InterruptedException, IOException 
	{
		try {
		Login l = new Login(driver, pr);
		l.signin("dasakshay@gmail.com", "Akshay1&2");
		Logs.takeLogs("TC1", "Login successfully");
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC1\\TC1_Passed.png");
		Logs.takeLogs("TC1", "TC1 is passed");
		}
		catch (Exception e) 
		{
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC1\\TC1_Failed.png");
		Logs.takeLogs("TC1", "TC1 is failed");
		}
		
	}
}