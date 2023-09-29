
Feature: Test login functionalities of Demo Smart Hospital

Background:
Given USer Should be on "https://demo.smart-hospital.in/site/userlogin"

  #@Positive_with_Excel 
  #Scenario: login with valid credentials
    #When user enters "<SheetName>" and <Rownumber>
    #And User clicks the Sign In button
    #Then User should be logged in successfully
 #
    #Examples: 
      #| SheetName          | Rownumber | 
      #| LoginCredentials   |     0     |
      #
   @Negative_With_Excel
  Scenario: login with Invalid credentials
    When user enters "<SheetName>" and <Rownumber>
    And User clicks the Sign In button
    Then User should Not logged in successfully
 
    Examples: 
      | SheetName          | Rownumber | 
      | LoginCredentials   |     1     |
          #
  #@Negative_with_passing_value
  #Scenario Outline: login with Invalid credentials
    #When users enter pat1 and user
    #And User clicks the Sign In button
    #Then User should Not logged in successfully
#
  #@Negative_with_datatables
  #Scenario Outline: login with Empty credentials
    #When users enter <username> and <password>
    #And User clicks the Sign In button
    #Then User should Not logged in successfully
 #
    #Examples:
      #| username            | password      |
      #|                     |               |
      #
  #@Logout
  #Scenario Outline: login with valid credentials and Logout
    #When users enter <username> and <password>
    #And User clicks the Sign In button
    #And user clicks on profile
    #And user clicks on logout
    #Then User should be logged out successfully
    #
 #
    #Examples:
      #| username            | password      |
      #| pat1                | password      |