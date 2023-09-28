package com.PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.PageLocators.OPDPageLocators;
import com.utilies.HelperClass;

public class OPDPageAction {
	
	OPDPageLocators objOPDLocator;
	public String str;
	
	public OPDPageAction()
	{
		this.objOPDLocator=new OPDPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objOPDLocator);
	}
	
	public void clickOPD()
	{
		objOPDLocator.clickOPD.click();
	}
	
	public void clickVisit()
	{
		objOPDLocator.clickVisit.click();
	}
	
	
	public void searchCaseId()
	{
		objOPDLocator.SearchUser.sendKeys("4788",Keys.ENTER);
		
	}
	
	public void getAllData()
	{
	   // Now get all the TR elements from the table
	   List<WebElement> allRows = objOPDLocator.table.findElements(By.tagName("tr"));
	   
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
	
	public void clickShow()
	{
		
		objOPDLocator.showbtn.click();
	}
	
	public String getPopUpText()
	{
	   WebElement txt=HelperClass.wait.until(ExpectedConditions.visibilityOf(objOPDLocator.showPopUpText));
		return txt.getText();
	}
	
	public void clickPopUpClose()
	{
		WebElement closepopup=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(objOPDLocator.clickShowClose));
		closepopup.click();
	}
	
	public void clickLabInv()
	{
		objOPDLocator.Lab_invest.click();
	}
	
	
	public void searchTestName()
	{
		objOPDLocator.searchTestName.sendKeys("Chest X-rays",Keys.ENTER);
	}
	
	public void clicklabShow()
	{
		objOPDLocator.Lab_investshowbtn.click();
	}
	
	public void clicklabpop()
	{
		WebElement closelabpopup=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(objOPDLocator.closLabPop));
		closelabpopup.click();
	}
	

}
