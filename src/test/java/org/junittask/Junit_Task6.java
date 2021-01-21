package org.junittask;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Task6 extends BaseClass {

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
	public void tc1() throws InterruptedException {
		LoginPojoDay6 l = new LoginPojoDay6();
		toSendKeys(l.getTxtEmail(), "priyasuresh221");
		toSendKeys(l.getTxtPass(), "supriya16");
		clicking(l.getBtnLogin());
		
		SearchHotelPojoDay6 s= new SearchHotelPojoDay6();
		selectIndex(s.getLocation(), 2);
		selectIndex(s.getHotelName(), 3);
		selectIndex(s.getRoomType(), 2);
		selectIndex(s.getNoOfRooms(), 2);
		toSendKeys(s.getChkInDate(), "20/06/1990");
		toSendKeys(s.getChckOutDate(), "06/06/1991");
		selectIndex(s.getAdultPerRoom(), 2);
		selectIndex(s.getChildPerRoom(), 1);
		clicking(s.getBtnSubmit());
		
		SelectPojoDay6 sl = new SelectPojoDay6();
		clicking(sl.getBtnRadio());
		clicking(sl.getBtnContinue());
		
		BookHotelPojoDay6 b = new BookHotelPojoDay6();
		toSendKeys(b.getFirstName(), "priya");
		toSendKeys(b.getLastName(), "suresh");
		toSendKeys(b.getAddress(), "bangalore");
		toSendKeys(b.getCreditCardNo(), "1234569871425369");
		selectIndex(b.getCreditCardType(), 2);
		selectIndex(b.getExpMonth(), 2);
		selectIndex(b.getExpYear(), 3);
		toSendKeys(b.getCvvNo(), "525");
		clicking(b.getBtnBookNow());
		Thread.sleep(5000);
		
		OrderNoPojoDay6 o = new OrderNoPojoDay6();
		String attribute = toGetAttribute(o.getOrderNo());
		System.out.println(attribute);
		
		
		
		
		
		
		
	}
	
}
