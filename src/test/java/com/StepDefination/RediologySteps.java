package com.StepDefination;

import org.testng.Assert;

import com.PageActions.RediologyAction;
import com.PageLocators.RedioLogyLocator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


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
   
//    String billno=redioaction.getBillno();
//    Assert.assertEquals(redioaction.getBillno(),"RADIOB298","This is correct Billno");
//    
//    Thread.sleep(5000);
	
	System.out.println("here we have to do assertion");
}





}
