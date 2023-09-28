Feature: Test Appointment functionalities of Demo Smart Hospital

Background:
 Given users should be on "https://demo.smart-hospital.in/patient/dashboard/"
  When users click on Sign In
  And Click on myappointments
  
 @AddAppointment
Scenario: User should Be on the webpage
And Click on AddAppointment
And click on Date
And Click on Specialist
And Click on Doctor
And click on Shift
And click on Slot
And click on Appointmentpriority
And click on Message
And click on Available slot
Then click on Save

@VisibleAppointment
Scenario: User should Be on the webPage 
And Click on Search
And Click on Show
Then Assert user is on popup box