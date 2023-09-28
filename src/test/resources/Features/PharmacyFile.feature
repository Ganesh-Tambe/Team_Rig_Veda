Feature: testing Pharmacy functinality of webpage
Scenario: checking Pharmacy functions
Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
When visitor click on sign in
And visitor click on Pharmacy
And  visitor search The bill no 
And  visitor click on pay
And visitor Click on Add
Then assertion for checking webpage 

