package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojoDay6 extends BaseClass {
	public SearchHotelPojoDay6() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotelName;

	@FindBy(id="room_type")
	private WebElement roomType;

	@FindBy(id="room_nos")
	private WebElement noOfRooms;

	@FindBy(id="datepick_in")
	private WebElement chkInDate;

	@FindBy(id="datepick_out")
	private WebElement chckOutDate;

	@FindBy(id="adult_room")
	private WebElement adultPerRoom;

	@FindBy(id="child_room")
	private WebElement childPerRoom;

	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getChkInDate() {
		return chkInDate;
	}

	public WebElement getChckOutDate() {
		return chckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	
	
	
	
	
	
}
