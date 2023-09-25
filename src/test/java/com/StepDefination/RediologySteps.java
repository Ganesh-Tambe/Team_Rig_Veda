package com.StepDefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.PageActions.RediologyAction;
import com.PageLocators.RedioLogyLocator;

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



}
