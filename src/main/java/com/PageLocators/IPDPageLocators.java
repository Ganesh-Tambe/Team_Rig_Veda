package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.FindBy;

import com.utilies.HelperClass;

import lombok.experimental.Helper;

public class IPDPageLocators {

	
	@FindBy(xpath= "//*[@id=\"sibe-box\"]/ul/li[4]/a")
	public WebElement clickIPD;
	
	@FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[2]/a")
	public WebElement clickMedication;
	
	@FindBy(xpath = "//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[2]/a")
	public WebElement AssertMEdication;
	
	
	
	
	///////////////////////////////
	@FindBy(xpath ="//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[3]/a")
	public WebElement clickprescription;
	
	@FindBy(xpath= "//*[@id=\"DataTables_Table_3_filter\"]/label/input")
	public WebElement clicksearch;
	
	@FindBy(xpath = "//*[@id=\"DataTables_Table_3\"]/tbody/tr/td[4]/a")
	public WebElement showbutton;
	
	@FindBy(xpath = "//*[@id=\"html-2-pdfwrapper\"]/div/div/div[2]/table[1]/tbody/tr/th[1]")
	public WebElement assertionPrescription;

	
	
	
	
	//////////////////////////////////////////////////////////////
	@FindBy(xpath="//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[8]/a")
	public WebElement clickPayment;
	
	@FindBy(xpath="//*[@id=\"payment\"]/div[1]/div/button")
	public WebElement clickMakePayment;
	
	@FindBy(xpath="//*[@id=\"pay_button\"]")
	public WebElement clickAdd;
		 
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[2]/div[2]/div/form/div/button")
	public WebElement payWithCard;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	
	public WebElement enterEmail;
	
	@FindBy(xpath="//*[@id=\"card_number\"]")
	public WebElement enterCardNumber;
	
	@FindBy(xpath="//*[@id=\"cc-exp\"]")
	public WebElement enetrExpiryDate;
	
	@FindBy(xpath="//*[@id=\"cc-csc\"]")
	public WebElement enetrCVC;
	
	@FindBy(xpath="//*[@id=\"billing-zip\"]")
	public WebElement enetrZipCode;
	
	@FindBy(xpath="//*[@id='submitButton']")
	public WebElement clickSummitButton;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/h4")
	public WebElement getSText;
	
	@FindBy(xpath="//*[@id=\"tabs\"]/div[1]/div[2]/div/ul/li[6]/a")
	public WebElement clickOpration ;
	
	@FindBy(xpath="//*[@id=\"operationtheatre\"]/div[3]/table/tbody/tr[1]/td[1]")
	public WebElement copyRefrenceNo;
	
	@FindBy(xpath="//*[@id=\"operationtheatre\"]/div[3]/table/tbody/tr[1]/td[6]/a")
	public WebElement clickShowRefrenceNo;
	
	@FindBy(xpath="//*[@id=\"show_ot_data\"]/div[1]/div[1]/p")
	public WebElement copyPopupRefrenceNo ;
	
	@FindBy(xpath="//*[@id=\"show_ot_data\"]/div[1]/div[1]")
	public WebElement assertCopyRefrenceNo;
	
	
}
