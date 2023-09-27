package com.StepDefination;

import java.time.Duration;

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
   objpharmacy.search();
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
	//WebElement element = driver.findElement(By.className("box-title"));
    // Get the text from the element
    //String elementText = element.getText();
	
	
}



}
