package com.PageActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.AmbulancePageLocators;
import com.utilies.HelperClass;

public class AmbulancePageAction {
	FileInputStream fileInput=null;
	AmbulancePageLocators objAmbulanc;
	String strEmail,strDate,strCVC,strZip;
	String strCardNumber;

	public AmbulancePageAction() {
		this.objAmbulanc = new AmbulancePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objAmbulanc);
	}

	public void clickAmbulance() {
		objAmbulanc.ambulanceTab.click();
	}

	//Print all data
	public void getAllData()

	{
		// Now get all the TR elements from the table
		List<WebElement> allRows = objAmbulanc.table.findElements(By.tagName("tr"));
       // And iterate over them, getting the cells
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.println("content >>   " + cell.getText());
				
			}
			System.out.println("\n");
			
		}

	}
	
	public void searchBill()
	{
		objAmbulanc.search.sendKeys("ACB62");
	}
	
	public void clickPay()
	{
		objAmbulanc.clickpay.click();
	}
	
	public void clickAdd()
	{
		objAmbulanc.clickAdd.click();
	}
	
	public void clickPayCard()
	{
		objAmbulanc.clickPayCard.click();
	}
	
	public void setEmail(String email)
	{
		objAmbulanc.email.sendKeys(email);
	}
	
	public void setCardNumber(String card_Number)
	{
		JavascriptExecutor js = ((JavascriptExecutor) HelperClass.driver);
	    js.executeScript("arguments[0].setAttribute('value','"+card_Number+"');", objAmbulanc.cardnumber);
	}
	
	public void setDate(String date)
	{
		objAmbulanc.date.sendKeys(date);
	}
	
	public void setCVC(String CVC_Number)
	{
		objAmbulanc.CVC.sendKeys(CVC_Number);
	}
	
	public void setZip(String Zip_Code)
	{
		objAmbulanc.zipnumber.sendKeys(Zip_Code);
	}
	
	public void clickPayment()
	{
		objAmbulanc.clickPayment.click();
	}
	
	public void FillPayment()
	{
		File file=new File("C:\\Users\\gtambe\\Desktop\\Github\\Team_Rig_Veda\\src\\test\\resources\\AmbulancePayment.properties");
		
		try
		{
			fileInput=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//creating object of properties file
		Properties prop=new Properties();
		
		try
		{
			prop.load(fileInput);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		strEmail=prop.getProperty("email");
		strCardNumber=prop.getProperty("card_Number");
		strDate=prop.getProperty("date");
		strCVC=prop.getProperty("CVC_Number");
		strZip=prop.getProperty("Zip_Code");
		
	
		
		//fill email
		this.setEmail(strEmail);
		
		//fill cardnumber
		this.setCardNumber(strCardNumber);

		
		//Fill date
		this.setDate(strDate);
		
		//Fill CVC Number
		this.setCVC(strCVC);
		
		//Fill ZipCode
		this.setZip(strZip);
		
    }
	
	//Get the success message
	public String getSText()
	{
		return objAmbulanc.Successmsg.getText();
	}
}
