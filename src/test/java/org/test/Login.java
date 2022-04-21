package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibraryClass {
	public Login() {
 PageFactory.initElements(driver, this);
	}

	@FindBy(id= "email")
	private WebElement txtemail;

	@FindBy(id= "password")
	private WebElement txtpass;

	@FindBy(id= "login")
	private WebElement txtlogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtlogin() {
		return txtlogin;
	}
}
