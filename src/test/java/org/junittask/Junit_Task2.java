package org.junittask;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Junit_Task2 extends BaseClass {

	@BeforeClass
	public static void launch() {
	launchBrowser("https://www.redbus.in/");
	}
	
	@AfterClass
	public static void close() {
	closing();
	}
	
	@Before
	public void starting() {
	Date d = new Date();
	System.out.println("started at:"+d);
	}
	
	@After
	public void ending() {
	Date d = new Date();
	System.out.println("ended at:"+d);
	}
	
	@Test
	public void tc1() throws InterruptedException {
		maxWindow();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(user);
		
		WebElement mobileNumber = driver.findElement(By.id("mobileNoInp"));
		mobileNumber.sendKeys("9980132308");
//		Assert.assertEquals("998032308", "12345789");
}
}