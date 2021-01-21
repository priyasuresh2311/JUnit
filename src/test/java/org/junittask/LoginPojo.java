package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
public LoginPojo() {
	PageFactory.initElements(driver, this);
}



public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}



@FindBy(id="email")
private WebElement txtEmail;

@FindBy(id="pass")
private WebElement txtpass;

@FindBy(name="login")
private WebElement btnLogin;

}
