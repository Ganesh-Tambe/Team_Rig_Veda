package com.StepDefination;

import java.time.Duration;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.PageActions.RediologyAction;
import com.PageLocators.RedioLogyLocator;
import com.utilies.HelperClass;

import io.cucumber.java.en.And;
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


@Then("then visitor should search for bill no {string}")
public void then_visitor_should_search_for_bill_no(String string) {
   redioaction.searchbill(string);
}




////////////////////////////////
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

}
