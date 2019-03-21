package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver;
	Properties pr;

	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr =pr;
	}
	
	public void signin(String user, String password1) throws InterruptedException
	{
		WebElement signin =driver.findElement(By.xpath(pr.getProperty("signin"))); 
		signin.click();
		 WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		 email.sendKeys(user); 
		 WebElement emailbtn= driver.findElement(By.xpath(pr.getProperty("emailbtn"))); 
		 emailbtn.click();
		 Thread.sleep(2000); 
		 WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
		  password.sendKeys(password1);
		  WebElement pswdbtn=driver.findElement(By.xpath(pr.getProperty("pswdbtn")));
		  pswdbtn.click();
	}
}
