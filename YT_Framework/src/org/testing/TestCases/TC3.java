package org.testing.TestCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends BaseClass
{	
	@Test
	public void SigninVideoLike() throws InterruptedException, IOException 
	{
		try {
		Login l = new Login(driver, pr);
		l.signin("dasakshay@gmail.com", "*******");
		Logs.takeLogs("TC3", "Login successfully");
		
		Video_Play v = new Video_Play(driver, pr);
		v.Videoplay();
		WebElement video_like = driver.findElement(By.xpath(pr.getProperty("like")));
		video_like.click();
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC3\\TC3_Passed.png");
		Logs.takeLogs("TC3", "TC3 is passed");
		}
		catch (Exception e)
		{
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC3\\TC3_Failed.png");
		Logs.takeLogs("TC3", "TC3 is failed");
		}
	}
	
}