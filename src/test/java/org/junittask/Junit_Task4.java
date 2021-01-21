package org.junittask;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


public class Junit_Task4 extends BaseClass {
	@BeforeClass
	public static void launch() {
		
		launchBrowser("https://www.flipkart.com/account/login");

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
	public void login() {
		maxWindow();
		LoginPojo2 l = new LoginPojo2();
		toSendKeys(l.getUserName(), "priyasuresh");
	
		toSendKeys(l.getPassWord(), "selenium@123");
		clicking(l.getBtnLogin());
		Assert.assertEquals("check the username", "PriyaSuresh", l.getUserName());
	}

}
