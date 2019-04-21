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

public class TC2 extends BaseClass
{
		
	@Test
	public void SigninSubscription() throws InterruptedException, IOException 
	{
		try {
		Login l = new Login(driver, pr);
		l.signin("dasakshay@gmail.com", "*******");
		Logs.takeLogs("TC2", "Login successfully");
		Thread.sleep(5000);
		WebElement subscription = driver.findElement(By.xpath(pr.getProperty("subscription1")));
		subscription.click();
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC2\\TC2_Passed.png");
		Logs.takeLogs("TC2", "TC2 is passed");
		}
		
		catch (Exception e) 
		{
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC2\\TC2_Failed.png");
		Logs.takeLogs("TC2", "TC2 is failed");
		}
	}
	
}
