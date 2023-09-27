Feature: Test Appointment functionalities of Demo Smart Hospital

Background:
 Given users should be on "https://demo.smart-hospital.in/patient/dashboard/"
 When users click on Sign In

Scenario: User should Be on the webpage
 When users click on Sign In
And Click on myappointments
And Click on AddAppointment
And click on Date
And Click on Specialist
And Click on Doctor
And click on Shift
And click on Slot
And click on Appointmentpriority
And click on Message
And click on AlternateAddress
Then click on Save