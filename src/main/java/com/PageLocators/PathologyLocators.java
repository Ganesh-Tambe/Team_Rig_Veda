package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PathologyLocators {
	
	@FindBy(xpath="//a[@href=\"https://demo.smart-hospital.in/patient/dashboard/search\"]")
	public WebElement clickPathology;
	
	@FindBy(tagName="input")
	public WebElement clickSearch;
	
	@FindBy(xpath="//th[@aria-label=\"Case ID: activate to sort column ascending\"]")
	public WebElement clickCaseId;
	
	@FindBy(xpath="//div[@id='testreport_wrapper']")
	public WebElement table;
	
	@FindBy(tagName="tr")
	public WebElement row;
	
	@FindBy(xpath="//td[@class='text-right'][4]//child::a[@data-record-id='358'][1]")
	public WebElement clickOnViewPayments;
	 
	@FindBy(xpath="//tr[@class='box box-solid total-bg']//td[5]")
	public WebElement Validate;

}
