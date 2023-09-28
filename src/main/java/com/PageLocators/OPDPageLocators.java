package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OPDPageLocators {
	
	//OPD locators
	@FindBy(partialLinkText="OPD")
	public WebElement clickOPD;
	
	//Visit tab locator
	@FindBy(linkText = "Visits")
	public WebElement clickVisit;
	
	//visit searchbar locator
	@FindBy(xpath = "//input[@type=\"search\"]")
	public WebElement SearchUser;
	
	//table in the visit section
	@FindBy(xpath ="//*[@id='DataTables_Table_1']")
	public WebElement table;
	
	//tabe row
	@FindBy(tagName="tr")
	public WebElement row;
	
	//text count
	@FindBy(id = "DataTables_Table_1_info")
	public WebElement searchRecords;
	
	//show button in visit section
	@FindBy(xpath="//*[@class='btn btn-default btn-xs get_opd_detail']")
	public WebElement showbtn;
	
	//text from popup
	@FindBy(xpath="//h4[@class=\"modal-title\" and text()=\"My Details\"]")
	public WebElement showPopUpText;
	
	
	//popup close  
	@FindBy(css="#viewModal .close")
	public WebElement clickShowClose;
	
	//Lab Investigation tab
	@FindBy(linkText="Lab Investigation")
	public WebElement Lab_invest;
	
	@FindBy(xpath="//input[@aria-controls=\"DataTables_Table_2\"]")
	public WebElement searchTestName;
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_2\"]/tbody/tr[1]/td[7]/a")
	public WebElement Lab_investshowbtn;
	
	@FindBy(css="#viewDetailReportModal .close")
	public WebElement closLabPop;

}
