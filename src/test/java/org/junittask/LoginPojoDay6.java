package org.junittask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoDay6 extends BaseClass {
public LoginPojoDay6() {
PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement txtEmail;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(id="login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


}
