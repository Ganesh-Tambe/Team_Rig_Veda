package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement clickSignIn;
	
	@FindBy(xpath="//*[@alt=\"User Image\"]")
	public WebElement clickProfile;
	
	@FindBy(linkText="Logout")
	public WebElement clickLogOut;

}
