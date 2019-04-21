package org.testing.TestCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC4 extends BaseClass
{	
	@Test
	public void SigninVideoSubscribe() throws InterruptedException, IOException 
	{
		try {
		Login l = new Login(driver, pr);
		l.signin("dasakshay@gmail.com", "*******");
		Logs.takeLogs("TC3", "Login successfully");
		Video_Play v = new Video_Play(driver, pr);
		v.Videoplay();		
		WebElement video_subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe")));
		video_subscribe.click();
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC4\\TC4_Passed.png");
		Logs.takeLogs("TC4", "TC4 is passed");
		}
		catch (Exception e) 
		{
		Screenshot.takeScreenshot(driver, "D:\\YT_Screenshots\\TC4\\TC4_Failed.png");
		Logs.takeLogs("TC4", "TC4 is failed");
		}
	}
	
}