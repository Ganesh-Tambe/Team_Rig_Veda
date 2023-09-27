package com.PageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.IPDPageLocators;
import com.utilies.HelperClass;

import io.cucumber.java.en.Then;

public class IPDPageAction {
	IPDPageLocators objIPDLocator;
	public static String str;
	public String popupRefrenceNo;
	
	public IPDPageAction()
	{
		this.objIPDLocator=new IPDPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objIPDLocator);		
	}

	public void clickIPD(){
		objIPDLocator.clickIPD.click();
	}
	
	public void clickMedication(){
		objIPDLocator.clickVisit.click();
	}
	
	public void clickprescription(){
		objIPDLocator.clickprescription.click();
	
	}
	
	public void clickSearch(){
		objIPDLocator.clicksearch.sendKeys("IPDP61",Keys.ENTER);		
	}
	
	public void showbutton(){
		objIPDLocator.showbutton.click();
	}
	public void clickPayment(){
		objIPDLocator.clickPayment.click();
	}
	public void clickMakePayment(){
		objIPDLocator.clickMakePayment.click();
	}
	public void clickAdd(){
		objIPDLocator.clickAdd.click();
	}
	public void payWithCard(){
		objIPDLocator.payWithCard.click();
	}
	public void enterEmail(){
	
		objIPDLocator.enterEmail.sendKeys("goutam@gamil.com",Keys.ENTER);
	}
	public void enterCardNumber(){

		JavascriptExecutor js = (JavascriptExecutor) HelperClass.driver;       
        js.executeScript("arguments[1].value = arguments[0]; ", "4242424242424242", objIPDLocator.enterCardNumber);     
 //       objIPDLocator.enterCardNumber.sendKeys("\n");        

	}
	public void enetrExpiryDate(){
		objIPDLocator.enetrExpiryDate.sendKeys("1/2028",Keys.ENTER);
	}
	public void enetrCVC(){
		objIPDLocator.enetrCVC.sendKeys("111",Keys.ENTER);
	}
	public void enetrZipCode(){
		objIPDLocator.enetrZipCode.sendKeys("402104",Keys.ENTER);
	}
	public void clickSummitButton(){
		objIPDLocator.clickSummitButton.click();
	}
	
	public void clickOpration(){
		objIPDLocator.clickOpration.click();
	}
	
	public void copyRefrenceNo(){
		objIPDLocator.copyRefrenceNo.getText();
	}
	
	public void clickShowRefrenceNo(){
		objIPDLocator.clickShowRefrenceNo.click();
	}
	
	public void copyPopupRefrenceNo(){
		popupRefrenceNo=objIPDLocator.copyPopupRefrenceNo.getText();
		System.out.println(popupRefrenceNo);
	}
	
	public void assertCopyRefrenceNo(){
		
	}

}
