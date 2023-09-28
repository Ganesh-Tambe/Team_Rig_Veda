Feature: Testing Pathology functionalities of Demo Smart Hospital

Background: 
 Given User should be on "https://demo.smart-hospital.in/patient/dashboard/"
 
 Scenario: User Performs the  functionality
   When user click on Sign In
   And user clicks on Pathology
   And search the inputs "<SheetName>" and <Rownumber>
   And user searches the caseID;
   And Print all the search results
   #And user click on view payments
   Then assert the user is on popup box
   
   Examples:
   |SheetName     |Rownumber |
   |Sheet1        |     0    |