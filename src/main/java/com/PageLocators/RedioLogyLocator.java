package com.PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilies.HelperClass;

public class RedioLogyLocator {

	
	
	@FindBy(xpath = "//*[text()=\" Ambulance\"]")
	public WebElement rediotable;
	
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]")
	public WebElement table;
	
	@FindBy(tagName  = "tr")
	public WebElement tid;
	
	
}
