Feature: testing rediology  functinality of webpage

Scenario: checking Rediology functinality

Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
When visitor click on sign in
And visitor click on Rediology
Then visitor should get the table data