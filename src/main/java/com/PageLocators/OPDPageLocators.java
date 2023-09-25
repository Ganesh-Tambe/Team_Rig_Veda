package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OPDPageLocators {
	
	@FindBy(partialLinkText="OPD")
	public WebElement clickOPD;
	
	@FindBy(linkText = "Visits")
	public WebElement clickVisit;
	
	@FindBy(xpath = "//input[@type=\"search\"]")
	public WebElement SearchUser;
	
	@FindBy(xpath ="//*[@id='DataTables_Table_1']")
	public WebElement table;
	
	@FindBy(tagName="tr")
	public WebElement row;
	
	@FindBy(id = "DataTables_Table_1_info")
	public WebElement searchRecords;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-xs get_opd_detail']")
	public WebElement showbtn;
	
	@FindBy(xpath="//th[text()=\"OPD Checkup ID\"]")
	public WebElement showPopUpText;
	
	
	//popup close  
	@FindBy(xpath="//*[@id=\"viewModal\"]/div/div/div[1]/button")
	public WebElement clickShowClose;
	
	@FindBy(linkText="Lab Investigation")
	public WebElement Lab_invest;
	
	@FindBy(xpath="//input[@aria-controls=\"DataTables_Table_2\"]")
	public WebElement searchTestName;
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_2\"]/tbody/tr[1]/td[7]/a")
	public WebElement Lab_investshowbtn;

}
