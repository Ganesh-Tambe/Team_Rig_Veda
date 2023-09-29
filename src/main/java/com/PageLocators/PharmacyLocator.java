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
	
	@FindBy(xpath = "//h3[text()=\"Payment Details\"]")
	public WebElement paydetails;
//---------------------------------------second scenario ---------------------------	
	@FindBy(xpath = "//input[@type=\"search\"]")
	public WebElement search_caseid;
	
	
	@FindBy(xpath = "//button[@type=\"button\" and @class=\"btn btn-primary btn-xs\"]")
	public WebElement pharmacypay;
	
	@FindBy(xpath = "//button[@id=\"pay_button\"]")
	public WebElement pharmacyadd;
	
	//button[@id="pay_button"]
	
	@FindBy(xpath = "//*[@id=\"patient_details\"]/div/div[2]/div/table/tbody/tr[1]/td[1]")
	public WebElement asserttext;
	
	@FindBy(xpath = "//h3[@class=\"box-title\" and text()=\"Payment Details\"]")
	public WebElement payment_details;
	
}
