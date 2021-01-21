package org.junittask;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Task1 extends BaseClass{
	
	@BeforeClass
	public static void launch() {
		launchBrowser("https://www.facebook.com/");
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
	public void tc1() {
	LoginPojo l = new LoginPojo();
	toSendKeys(l.getTxtEmail(), "Java");
	toSendKeys(l.getTxtpass(), "selenium@123");
	clicking(l.getBtnLogin());
	}
	
	
	
	
}
