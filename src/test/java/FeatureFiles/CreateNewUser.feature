
Feature: Login Action

  Background: 
    Given user is on Home Page "browser"

  Scenario: Create New User
    When User navigate to Login Page
    And user enters new user details 
    | Female | fname4 | lname4 | testaddress | san diago | CaL | 1025 | Egypt | 10215488751 | 23/09/1985 | mtest4@test.com | P@ssw0rd | P@ssw0rd |
    Then New User is created successfully
    

      