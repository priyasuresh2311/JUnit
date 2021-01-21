package org.junittask;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junittask.BookHotelPojoDay6;
import org.junittask.LoginPojoDay6;
import org.junittask.OrderNoPojoDay6;
import org.junittask.SearchHotelPojoDay6;
import org.junittask.SelectPojoDay6;

public class JUnit_Task7 extends BaseClass{
	@BeforeClass
	public static void launch() {
	launchBrowser("http://www.adactin.com/HotelApp");
	}
	
	@AfterClass
	public static void closeBrowser() {
	closing();
	}
	
	@Before
	public void starting() {
	Date d = new Date();
	System.out.println("going to start at:"+d);
	}
	
	@After
	public void ending() {
		Date d = new Date();
		System.out.println("going to end at:"+d);
	}
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		launchBrowser("http://www.adactin.com/HotelApp/");
		maxWindow();
		LoginPojoDay6 l = new LoginPojoDay6();
		toSendKeys(l.getTxtEmail(), excelRead(1, 0));
		
		toSendKeys(l.getTxtPass(), excelRead(1, 1));
		clicking(l.getBtnLogin());
		
		SearchHotelPojoDay6 s= new SearchHotelPojoDay6();
		selectSngleIndex(s.getLocation(), excelRead(1, 2));
		
		selectSngleIndex(s.getHotelName(), excelRead(1, 3));
		
		selectSngleIndex(s.getRoomType(), excelRead(1, 4));
		
		selectSngleIndex(s.getNoOfRooms(), excelRead(1, 5));
		
		toSendKeys(s.getChkInDate(), excelRead(1, 6));
		
		toSendKeys(s.getChckOutDate(), excelRead(1, 7));
		
		selectSngleIndex(s.getAdultPerRoom(), excelRead(1, 8));
		
		selectSngleIndex(s.getChildPerRoom(), excelRead(1, 9));
		
		clicking(s.getBtnSubmit());
		
		SelectPojoDay6 sl = new SelectPojoDay6();
		clicking(sl.getBtnRadio());
		
		clicking(sl.getBtnContinue());
		
		BookHotelPojoDay6 bk = new BookHotelPojoDay6();
		toSendKeys(bk.getFirstName(), excelRead(1, 10));
		
		toSendKeys(bk.getLastName(), excelRead(1, 11));
		
		toSendKeys(bk.getAddress(), excelRead(1, 12));
		
		toSendKeys(bk.getCreditCardNo(), excelRead(1, 13));
		
		selectSngleIndex(bk.getCreditCardType(), excelRead(1, 14));
		
		selectSngleIndex(bk.getExpMonth(), excelRead(1, 15));
		
		selectSngleIndex(bk.getExpYear(), excelRead(1, 16));
		
		toSendKeys(bk.getCvvNo(), excelRead(1, 17));
		
		clicking(bk.getBtnBookNow());
		
		OrderNoPojoDay6 od = new OrderNoPojoDay6();
		
		
		Thread.sleep(5000);

		String attribute = toGetAttribute(od.getOrderNo());
		System.out.println(attribute);
		excelWrite(0, 18, "Order Number");
		excelWrite(1, 18, attribute);

	}
}
