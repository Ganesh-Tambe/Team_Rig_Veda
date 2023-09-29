package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmbulancePageLocators {
	@FindBy(xpath="//*[text()='Ambulance']")
	public WebElement ambulanceTab;
	
	@FindBy(xpath="//*[@class='dataTables_wrapper no-footer']")
	public WebElement table;
	
	@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
	public WebElement search;
	
	@FindBy(xpath="//button[contains(@onclick, '95.00')]")
	public WebElement clickpay;
	
	@FindBy(xpath="//button[@id=\"pay_button\"]")
	public WebElement clickAdd;
	
	@FindBy(xpath="//*[text()=\"Pay with Card\"]")
	public WebElement clickPayCard;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='card_number']")
	public WebElement cardnumber;
	
	@FindBy(xpath="//*[@placeholder=\"MM / YY\"]")
	public WebElement date;
	
	@FindBy(xpath="//*[@id='cc-csc']")
	public WebElement CVC;
	
	@FindBy(name="zip")
	public WebElement zipnumber;
	
	@FindBy(xpath="//*[text()='Pay $95.00']")
	public WebElement clickPayment;
	
	@FindBy(xpath="//h4[contains(text(),'Success')]")
	public WebElement Successmsg;
	
	

}
