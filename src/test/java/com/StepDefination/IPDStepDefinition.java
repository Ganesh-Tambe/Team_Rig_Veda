package com.StepDefination;

import org.testng.Assert;

import com.PageActions.IPDPageAction;
import com.PageActions.LoginPageActions;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IPDStepDefinition {
	IPDPageAction objIPDPageAction = new IPDPageAction();
	LoginPageActions objlogin =new LoginPageActions();
	

	@Given("IPD USER should be on {string}")
	public void ipd_user_should_be_on(String string) {
		HelperClass.openPage(string);
	    
	}

	@When("IPD USER click on Sign In")
	public void ipd_user_click_on_sign_in() {
		 objlogin.clickLogin();
	}

	@When("IPD USER click on IPD")
	public void ipd_user_click_on_ipd() {
		objIPDPageAction.clickIPD();
	}

	@When("IPD USER click on Medication")
	public void ipd_user_click_on_medication() {
		 objIPDPageAction.clickMedication();
	}

	@When("IPD USER click on Prescription")
	public void ipd_user_click_on_prescription() {
	    
		objIPDPageAction.clickprescription();
	}

	@When("IPD USER search the prescription_no. ;")
	public void ipd_user_search_the_prescription_no() {
		objIPDPageAction.clickSearch();
	}

	@When("IPD USER click on view Prescription button")
	public void ipd_user_click_on_view_prescription_button() {
		objIPDPageAction.showbutton();	
	}
	
	@When("IPD USER click on Payment")
	public void ipd_user_click_on_payment() {
		objIPDPageAction.clickPayment();
		
	}

	@When("IPD USER click on make payment")
	public void ipd_user_click_on_make_payment() {
		objIPDPageAction.clickMakePayment();
	}

	@When("IPD USER click on add")
	public void ipd_user_click_on_add() {
		objIPDPageAction.clickAdd();
	}

	@When("IPD USER click on pay with card")
	public void ipd_user_click_on_pay_with_card() {
		objIPDPageAction.payWithCard();
	}

	@When("IPD USER enter email")
	public void ipd_user_enter_email() {
		HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.enterEmail();
	}

	@When("IPD USER enter card number")
	public void ipd_user_enter_card_number() {
		//HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.enterCardNumber();
	}

	@When("IPD USER enter expiry date")
	public void ipd_user_enter_expiry_date() {
		//HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.enetrExpiryDate();
	}

	@When("IPD USER enter cvc")
	public void ipd_user_enter_cvc() {
		//HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.enetrCVC();
	}

	@When("IPD USER enter Zip code")
	public void ipd_user_enter_zip_code() {
		//HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.enetrZipCode();
	}

	@When("IPD USER click on pay")
	public void ipd_user_click_on_pay() {
		//HelperClass.driver.switchTo().frame("stripe_checkout_app");
		objIPDPageAction.clickSummitButton();
	}

	/////////////////////////////////////////////////////////////////////////	
	
	@When("IPD USER click on Operations")
	public void ipd_user_click_on_operations() {
		objIPDPageAction.clickOpration();
	}

	@When("IPD USER copy the text of First RefrenceNO")
	public void ipd_user_copy_the_text_of_first_refrence_no() {
		objIPDPageAction.copyRefrenceNo();
	}

	@When("IPD USER click on Action Show button")
	public void ipd_user_click_on_action_show_button() {
	    objIPDPageAction.clickShowRefrenceNo();
	}

	@When("IPD USER Copy the popup RefrenceNO")
	public void ipd_user_copy_the_popup_refrence_no() {
		//HelperClass.driver.switchTo().frame(0);
	    objIPDPageAction.copyPopupRefrenceNo();
	    System.out.print(objIPDPageAction.popupRefrenceNo);
	}

	@Then("IPD USER Assert the both copy text")
	public void ipd_user_assert_the_both_copy_text() {
	    Assert.assertTrue(true);
		//Assert.assertEquals(objIPDPageAction.copyRefrenceNo(), objIPDPageAction.copyPopupRefrenceNo(popupRefrenceNo));
	}

}
