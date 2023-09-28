package com.PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.PageLocators.BloodBankPageLocators;
import com.PageLocators.LoginPageLocators;
import com.utilies.HelperClass;

public class BloodBankPageAction {
	BloodBankPageLocators bloodbanklocators=null;
	
	public BloodBankPageAction(){
		this.bloodbanklocators=new BloodBankPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), bloodbanklocators);

	}
	
	public void ClickingOnBloodBank() {
		bloodbanklocators.clickOnBloodBank.click();
		}
	public void ClickingSearch() {
		bloodbanklocators.clickOnSearch.sendKeys("B+",Keys.ENTER);
	}
	
//	public void ClickingOnIssueDate() {
//		
//	}
//	
	public void getAllData()
	{
	   // Now get all the TR elements from the table
	   List<WebElement> allRows = bloodbanklocators.table.findElements(By.tagName("tr"));
	   
	// And iterate over them, getting the cells
	for (WebElement row : allRows)
	  {
	    List<WebElement> cells = row.findElements(By.tagName("td"));
	    for (WebElement cell : cells) 
	    {
	        System.out.println("content >>   " + cell.getText());
	    }
	  }
	}
	public void ClickingOnShowbtn() {
		bloodbanklocators.showbtn.click();
	}
	
//	public void ClickingOnPopup() {
//		bloodbanklocators.popupText.click();
//	}
	public void ClickingOnClose() {
//		Actions ac = new Actions(HelperClass.getDriver());
//		WebElement cl = bloodbanklocators.closePop;
//		ac.moveToElement(cl);
//		ac.click(cl);
		WebElement cls=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bloodbanklocators.closePop));
		cls.click();
	}

}