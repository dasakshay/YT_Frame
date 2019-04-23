package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public ChromeDriver driver;
	public Properties pr;
	
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void signin(String user, String password) throws InterruptedException
	{
		WebElement signin = driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		WebElement emailid = driver.findElement(By.xpath(pr.getProperty("emailid")));
		emailid.sendKeys(user);
		WebElement next = driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		Thread.sleep(3000);
		WebElement password1 = driver.findElement(By.xpath(pr.getProperty("password")));
		password1.sendKeys(password);
		Thread.sleep(3000);
		WebElement nxt = driver.findElement(By.xpath(pr.getProperty("nxt")));
		nxt.click();
		Thread.sleep(5000);
	}
	
}
