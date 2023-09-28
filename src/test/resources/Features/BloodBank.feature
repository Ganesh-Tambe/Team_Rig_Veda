Feature: Test BloodBank functionalities of Demo Smart Hospital

Background:
 Given blood bank User should be on "https://demo.smart-hospital.in/patient/dashboard/"
 
 Scenario: blood bank User Performs the Bloodbank functionality With Visit section
   When blood bank User click on Sign In
   And blood bank User click on Bloodbank
   And blood bank User clicks on search
   And Print all the data
   And blood bank User clicks on show button
   Then Asserting the popup box
   And Close the popup box