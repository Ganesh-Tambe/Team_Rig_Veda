package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPageLocators {
	
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/page/events']")
	public WebElement clickEvents; 
	
	@FindBy(xpath="//a[@class=\"view-all-btn\"]")
	public WebElement clickViewDetails;
	
	@FindBy(xpath="")
	public WebElement Validate;

}
