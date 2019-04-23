package org.testing.Pages;

import java.util.List;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Utilities.Logs;

public class Video_Play 
{
	ChromeDriver driver;
	Properties pr;
	
	public Video_Play(ChromeDriver driver, Properties pr) 
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void Videoplay() throws InterruptedException
	{
		List<WebElement> videoplay = driver.findElements(By.id(pr.getProperty("vidioplay")));
		videoplay.get(1).click();
		Logs.takeLogs("Video_Play", "Video played successfully");
		Thread.sleep(10000);
	}
}
