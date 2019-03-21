package org.testing.testScripts;



import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC1 extends Base {
	@Test
	public void tc1() throws InterruptedException, IOException
	{
		try {
		Login l = new Login(driver,pr);
		l.signin("shah.syed1990@gmail.com", "decjan@3113");
		Logs.take_logs("tc1","Login");
		WebElement utubemenu = driver.findElement(By.xpath(pr.getProperty("utubemenu")));
		utubemenu.click();
				 Thread.sleep(4000); 
				 WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending"))); 
				 trending.click();
				 Logs.take_logs("tc1","Test Case Pass");
		}catch(Exception e)
		{
				 Screenshot.take_screenshot(driver,"C:\\first.png");
		}
				  
	}
	
	
	/*
	 * @Test public void tc1() throws InterruptedException { WebElement signin
	 * =driver.findElement(By.xpath(pr.getProperty("signin"))); signin.click();
	 * WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
	 * email.sendKeys("shah.syed1990@gmail.com"); WebElement emailbtn=
	 * driver.findElement(By.xpath(pr.getProperty("emailbtn"))); emailbtn.click();
	 * Thread.sleep(2000); WebElement password =
	 * driver.findElement(By.xpath(pr.getProperty("password")));
	 * password.sendKeys("decjan@3113"); WebElement pswdbtn=
	 * driver.findElement(By.xpath(pr.getProperty("pswdbtn"))); pswdbtn.click();
	 * WebElement utubemenu =
	 * driver.findElement(By.xpath(pr.getProperty("utubemenu"))); utubemenu.click();
	 * Thread.sleep(2000); WebElement trending =
	 * driver.findElement(By.xpath(pr.getProperty("trending"))); trending.click();
	 * 
	 * 
	 * }
	 */
	
	

}
