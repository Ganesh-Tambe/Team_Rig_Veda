Feature: testing rediology  functinality of webpage

Background: 

Given  visitor should be on "https://demo.smart-hospital.in/patient/dashboard" 
When visitor click on sign in
And visitor click on Rediology


Scenario: checking Rediology functinality

Then visitor should get the table data

Scenario:

And then visitor should search for bill no "RADIOB107"
And then click on view
And assert the text

