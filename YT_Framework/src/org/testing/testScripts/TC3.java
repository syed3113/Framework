package org.testing.testScripts;




import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC3 extends Base {
	
	
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		try {
		Login l = new Login(driver,pr);
		l.signin("shah.syed1990@gmail.com","decjan@3113");
		Video_Play v = new Video_Play(driver, pr);
		v.video();
		Thread.sleep(4000);
	    WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		
		}catch(Exception e)
		{
			
			 Screenshot.take_screenshot(driver,"C://third.png");
	}
		
	}
	
	
//	@Test
//	public void tc3() throws InterruptedException
//	{
//		WebElement signin =driver.findElement(By.xpath(pr.getProperty("signin")));
//		signin.click();
//		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
//		email.sendKeys("shah.syed1990@gmail.com");
//		WebElement emailbtn= driver.findElement(By.xpath(pr.getProperty("emailbtn")));
//		emailbtn.click();
//		Thread.sleep(2000);
//		WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
//		password.sendKeys("decjan@3113");
//		WebElement pswdbtn= driver.findElement(By.xpath(pr.getProperty("pswdbtn")));
//		pswdbtn.click();
//		List<WebElement> video = driver.findElements(By.id(pr.getProperty("videos")));
//		video.get(0).click();
//		Thread.sleep(2000);
//		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
//		like.click();
//		
//	}
	
	


}
