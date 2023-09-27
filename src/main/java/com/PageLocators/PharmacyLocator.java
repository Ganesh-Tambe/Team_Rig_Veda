package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmacyLocator {
	
	@FindBy(xpath="// *[text()=' Pharmacy']")
	public WebElement pharmacymenu;
	
	@FindBy(xpath = "//input[@type=\"search\"]")
	public WebElement billsearch;
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-xs\"]")
	public WebElement paybtm;
	
	@FindBy(id = "pay_button")
	public WebElement addbtn;
	
	@FindBy(className  ="box-title")
	public WebElement title;
	
	
	
	
}
