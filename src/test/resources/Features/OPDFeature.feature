Feature: Test OPD functionalities of Demo Smart Hospital

Background:
 Given User should be on "https://demo.smart-hospital.in/patient/dashboard/"
 When user click on Sign In
 And user click on OPD
 
 @VISITS
 Scenario: User Perform the OPD functionality With Visit section
   And user click on Visit
   And user search the caseID;
   And Print all the search Results
   And user click on show button
   And Assert the user is on popup box
   Then close Show PopUp
  
   
   
 @Lab-Investigation
 Scenario: User Perform the OPD functionality With Lab_investigation section
   And user click on Lab-Investigation
   And user search the test_name ;
   And user click on lab_show button
   And Assert the user is on popup box
