package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_Play {
	ChromeDriver driver;
	Properties pr;
	public Video_Play(ChromeDriver driver, Properties pr) {
		
		this.driver = driver;
		this.pr= pr;
		
		
	}
 public void video()
 {
	 List<WebElement> video = driver.findElements(By.id(pr.getProperty("videos")));
		video.get(0).click();
 }
}
