package com.StepDefination;

import java.time.Duration;

import org.testng.Assert;

import com.PageActions.LoginPageActions;
import com.PageActions.PharmacyAction;
import com.utilies.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PharmacySteps {

	PharmacyAction objpharmacy=new PharmacyAction();
	LoginPageActions objlogin=new LoginPageActions();
	
@Given("visitor should be on {string}")
public void visitor_should_be_on(String string) {
    HelperClass.openPage(string);
   
}

@When("visitor click on sign in")
public void visitor_click_on_sign_in() {
    // Write code here that turns the phrase above into concrete actions
    objlogin.clickLogin();
}

@And("visitor click on Pharmacy")
public void visitor_click_on_pharmacy() {
    // Write code here that turns the phrase above into concrete actions
   objpharmacy.clickPharmacy();
}

@And("visitor search The bill no")
public void visitor_search_the_bill_no() {
    // Write code here that turns the phrase above into concrete actions
   objpharmacy.search_bill();
}

@And("visitor click on pay")
public void visitor_click_on_pay() {
    // Write code here that turns the phrase above into concrete actions
    objpharmacy.clickPay();
}

@And("visitor Click on Add")
public void visitor_click_on_add() {
    // Write code here that turns the phrase above into concrete actions
	HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
   objpharmacy.clickAdd();
}

@Then("assertion for checking webpage")
public void assertion_for_checking_webpage() {
	
	String expected = "Payment Details";
	String actual =objpharmacy.asserttext();	
	System.out.println(actual+" this is actuaal");
	Assert.assertEquals(expected, actual,"this is correct payment ");
}

//------------------------------- second  scenario ------------------------------

@Given("search for bill {string}")
public void print_the_name_and(String string) {
   objpharmacy.search_caseid(string);
}

@And("visiotor click on bill pay")
public void visiotor_click_on_bill_pay() {
    objpharmacy.clickPay();
}
@And("visitor should click on add")
public void visitor_should_click_on_add() throws InterruptedException {
    objpharmacy.clickadd();  
}
@And("perform assertion")
public void perform_assertion() {
    
    String actualtext="Payment Details";
    Assert.assertEquals(objpharmacy.pharmacy_assertion_txt(),actualtext," Assirtion Succefull");
   
}


}
