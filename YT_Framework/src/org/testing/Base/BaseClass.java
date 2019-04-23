package org.testing.Base;

import java.io.*;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public Properties pr;
	public ChromeDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void BrowserLaunch() throws IOException, InterruptedException
	{
		File f = new File("../YT_Framework/OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Das\\Desktop\\Chrome Driver\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void CloseMethod() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.close(); 
	}
}
