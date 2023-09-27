package com.PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilies.HelperClass;

public class RedioLogyLocator {

	@FindBy(xpath = "//span[text()=\" Radiology\"]")
	public WebElement rediotable;
	
	@FindBy(tagName = "table")
	public WebElement table;
	
	@FindBy(tagName  = "tr")
	public WebElement tid;
	
	@FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr/td[10]/a[2]")
	public WebElement view;
	
	@FindBy(xpath = "//*[@id=\"testreport_filter\"]/label/input")
	public WebElement search;
	
	@FindBy(xpath = "//*[@id=\"testreport\"]/tbody/tr/td[7]")
	public WebElement amount;
	
	@FindBy(xpath = "//label[text()=\"Bill No\"]")
	public WebElement viewbillnotxt;
	
	@FindBy(xpath = "//*[@id=\"viewDetailReportModal\"]/div/div/div[1]/h4")
	public WebElement billn;
	
	
	
}
