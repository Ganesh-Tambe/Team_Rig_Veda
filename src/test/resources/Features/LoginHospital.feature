Feature: Test login functionalities of Demo Smart Hospital

Background:
Given USer Should be on "https://demo.smart-hospital.in/site/userlogin"

  @Positive
  Scenario Outline: login with valid credentials
    When user enters <username> and <password>
    And User clicks the Sign In button
    Then User should be logged in successfully
 
    Examples:
      | username            | password      |
      | pat1                | password      |
      
  @Negative
  Scenario Outline: login with Invalid credentials
    When user enters <username> and <password>
    And User clicks the Sign In button
    Then User should Not logged in successfully
 
    Examples:
      | username            | password      |
      | pat1                |user           |
      
  @Negative
  Scenario Outline: login with Empty credentials
    When user enters <username> and <password>
    And User clicks the Sign In button
    Then User should Not logged in successfully
 
    Examples:
      | username            | password      |
      |                     |               |
      
  @Logout
  Scenario Outline: login with valid credentials and Logout
    When user enters <username> and <password>
    And User clicks the Sign In button
    And user clicks on profile
    And user clicks on logout
    Then User should be logged out successfully
    
 
    Examples:
      | username            | password      |
      | pat1                | password      |