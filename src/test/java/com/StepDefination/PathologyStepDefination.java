package com.StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.PageActions.LoginPageActions;
import com.PageActions.PathologyActions;
import com.utilies.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PathologyStepDefination {
	PathologyActions objaction = new PathologyActions();
	LoginPageActions objLogin = new LoginPageActions();

	@When("user clicks on Pathology")
	public void user_clicks_on_pathology() {
		objaction.Clickpathology();
	}

	@When("search the inputs {string} and {int}")
	public void search_the_inputs_and(String Value, Integer rownumber) throws Exception {
		ExcelReader excelReader=new ExcelReader();
		List<Map<String,String>> LoginData=excelReader.getData("src/main/java/com/testData/Pathology.xls",Value);
		String value1=LoginData.get(rownumber).get("Value");
		objaction.Clicksearch(value1);
 
	}

//
//	@When("user click on Search")
//	public void user_click_on_search() {
//		objaction.Clicksearch();
//	}

	@When("user searches the caseID;")
	public void user_searches_the_case_id() {
		objaction.ClickcaseId();
	}

	@When("Print all the search results")
	public void print_all_the_search_results() {
		objaction.getAllData();
	}

//	@When("user click on view payments")
//	public void user_click_on_view_payments() {
//		objaction.ClickViewPayments();
//	}

	@Then("assert the user is on popup box")
	public void assert_the_user_is_on_popup_box() {
		Assert.assertTrue(objaction.ValidateText().contains("Records: 1 to 1 of 1 (filtered from 37 total records)"));
		System.out.println(objaction.ValidateText());

	}

}
