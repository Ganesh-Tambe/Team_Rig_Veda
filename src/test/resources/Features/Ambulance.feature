Feature: Test Ambulance functionalities from Demo Smart Hospital

Background: 
  Given user should be on "https://demo.smart-hospital.in/patient/dashboard/"
  When  user click on Sign In
  
 @PrintData
Scenario: Test the Ambulance Data
 And  user click on Ambulance
 And prints the All Vehicle number
 And search the Bill number
 And click on Pay
 And click on add
 And click on Pay Card
 And Enter the payment Details
 And click on payment
 Then Assert The Payment Success Message
 
 
 