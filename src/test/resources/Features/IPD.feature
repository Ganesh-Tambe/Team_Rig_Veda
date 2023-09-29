Feature: Test IPD functionalities of Demo Smart Hospital

Background:

	Given IPD USER should be on "https://demo.smart-hospital.in/patient/dashboard/"
	When IPD USER click on Sign In
	And IPD USER click on IPD



## IPD USER Perform the IPD functionality With Medication section
#@Medication
#Scenario: IPD USER Perform the IPD functionality With Medication section
#
   #And IPD USER click on Medication
   #Then Assert the Medication
   

##IPD USER Perform the IPD functionality With Prescription section  
#@Prescription
#Scenario: IPD USER Perform the IPD functionality With Prescription section
#	 
   #And IPD USER click on Prescription
   #And IPD USER search the prescription_no. ;
   #And IPD USER click on view Prescription button
   #And Assert the user is on popup box of IPDP61



#####IPD USER Perform the IPD functionality With Payments section
#@Payments
#Scenario: IPD USER Perform the IPD functionality With Payments section  
   #And IPD USER click on Payment 
	 #And IPD USER click on make payment
   #And IPD USER click on add
   #And IPD USER click on pay with card
   #And IPD USER enter email
   #And IPD USER enter card number
   #And IPD USER enter expiry date 
   #And IPD USER enter cvc 
   #And IPD USER enter Zip code 
   #And IPD USER click on pay
   
   
   
@Operations
Scenario: IPD USER Perform the IPD functionality With Payments section  
   
   And IPD USER click on Operations
   And IPD USER copy the text of First RefrenceNO
   And IPD USER click on Action Show button
   And IPD USER Copy the popup RefrenceNO
   Then IPD USER Assert the both copy text  
   
   
   
   
   