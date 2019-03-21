package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void browserLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sadia Shah\\Desktop\\Ahtisham\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		
		File f = new File("..\\YT_Framework\\or.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
