Feature: testing Pharmacy functinality of webpage

Background:

@tabledata
Scenario: checking Pharmacy functions
Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
When visitor click on sign in
And visitor click on Pharmacy
And  visitor search The bill no 
And  visitor click on pay
And visitor Click on Add
Then assertion for checking webpage 


@billsearch

 Scenario Outline: demo scenario
 Scenario: checking Pharmacy functions
 Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
 When visitor click on sign in
 And visitor click on Pharmacy
 And search for bill "<bill>"
 And visiotor click on bill pay
 And visitor should click on add 
 Then perform assertion
 Examples:

 |bill|
 |121|
 |121|

 