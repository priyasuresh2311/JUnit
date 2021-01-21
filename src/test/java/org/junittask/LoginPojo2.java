package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo2 extends BaseClass {
public LoginPojo2() {
PageFactory.initElements(driver, this);

}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement userName;

@FindBy(xpath="//input[@type='password']")
private WebElement passWord;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement btnLogin;

public WebElement getUserName() {
	return userName;
}

public WebElement getPassWord() {
	return passWord;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


}