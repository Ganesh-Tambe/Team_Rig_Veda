package com.Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class RunnerClass {
	@CucumberOptions(
			features = "src\\test\\resources\\Features\\LoginHospital.feature",
			tags = "@Positive_with_Excel",
			glue = "com.StepDefination",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}

}
 



