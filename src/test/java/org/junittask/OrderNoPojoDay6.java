package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNoPojoDay6 extends BaseClass{
public OrderNoPojoDay6() {
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//input[@id='order_no']")
private WebElement orderNo;


public WebElement getOrderNo() {
	return orderNo;
}






}
