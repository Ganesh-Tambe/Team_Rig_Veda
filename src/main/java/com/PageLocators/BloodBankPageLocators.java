package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BloodBankPageLocators {
	
	@FindBy(partialLinkText="Blood Bank")
			public WebElement clickOnBloodBank;
	
	@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
	public WebElement clickOnSearch;
	
	@FindBy(xpath="//table[@id='DataTables_Table_0']")
	public WebElement table;
	
	//@FindBy(xpath="")
	
	@FindBy(tagName="th")
	public WebElement row;
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[13]/a[1]")
	public WebElement showbtn;
	
//	@FindBy(xpath="//div[@class='modal-body min-h-3']")
//	public WebElement popupText;
//	
//	@FindBy(xpath="//button[@data-id='languageSwitcher']")
//	public WebElement close;
	

}
