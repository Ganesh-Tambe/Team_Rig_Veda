package com.StepDefination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help;
import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.PageActions.RediologyAction;
import com.PageLocators.RedioLogyLocator;
import com.utilies.HelperClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.experimental.Helper;


public class RediologySteps {

	RediologyAction redioaction = new RediologyAction();
    RedioLogyLocator rediolocator= new RedioLogyLocator();
    
@When("visitor click on Rediology")
public void visitor_click_on_rediology() {
    // Write code here that turns the phrase above into concrete actions
    redioaction.clickRadiology();
}

@Then("visitor should get the table data")
public void visitor_should_get_the_table_data() {
   redioaction.fetchdata();
}

//       "  this is Radiology caseid assertion ( Assending or dessending ) ---------- second scenario  -------------  "

@When("then visitor should search for bill <bill_no>")
public void then_visitor_should_search_for_bill_bill_no(DataTable dataTable) {
    ArrayList<List<String>> arr = new ArrayList<>(dataTable.asLists());

    // Now you have an ArrayList of ArrayLists of strings where each inner ArrayList represents a row in the DataTable.
    // You can process the data as needed.
    for (List<String> row : arr) {
        for (String billNo : row) {
            redioaction.searchbill(billNo);
            // Assuming that each value in the row is a bill_no to search.
        }
    }
}



@Then("then click on view")
public void then_click_on_view() {

redioaction.clickview();
}





@Then("assert the value")
public void assert_the_value() {
    System.out.println("this is ending part assertion");
}

@And("assert the text")
public void assert_the_text() throws InterruptedException {
	
	
    String expected="RADIOB107";
    String actual=redioaction.getBillno();
	
	Assert.assertEquals(expected,actual," Assertion Completed ");
}

@Then("click on close")
public void click_on_close() {
    redioaction.closetab();
}


//-----------------------------------          third scenario                ---------------------------------------------------------------------


@When("search case id in search box <caseid>")
public void search_case_id_in_search_box(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 ArrayList<List<String>> arr = new ArrayList<>(dataTable.asLists());

	    // Now you have an ArrayList of ArrayLists of strings where each inner ArrayList represents a row in the DataTable.
	    // You can process the data as needed.
	    for (List<String> row : arr) {
	        for (String billNo : row) {
	        	
	            redioaction.searchCaseid(billNo);
	            
	            // Assuming that each value in the row is a bill_no to search.
	        }
	    }
}

@When("click on view payment")
public void click_on_view_payment() {
redioaction.click_on_view();
 
}

@When("assert the result")
public void assert_the_result() {
  System.out.println("assert the result for caseid");
  String expectedurl="https://demo.smart-hospital.in/patient/dashboard/radioreport#";
  Assert.assertEquals(redioaction.assertText(),expectedurl);
}



@Given("search case id in search box {string}")
public void search_case_id_in_search_box(String string) {
   System.out.println("this is last scenario");
}
}





