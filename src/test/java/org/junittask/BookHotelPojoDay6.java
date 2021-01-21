package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojoDay6 extends BaseClass {

	public BookHotelPojoDay6() {
	
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
}
