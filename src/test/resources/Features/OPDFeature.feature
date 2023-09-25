Feature: Test OPD functionalities of Demo Smart Hospital

Background:
 Given User should be on "https://demo.smart-hospital.in/patient/dashboard/"
 
 Scenario: User Perform the OPD functionality With Visit section
   When user click on Sign In
   And user click on OPD
   And user click on Visit
   And user search the caseID;
   And Print all the search Results
   And user click on show button
   Then Assert the user is on popup box