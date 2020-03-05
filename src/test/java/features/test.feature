
Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on loginpage
    Then user get page title verified
    When user enters username and Password
    Then Check the username in homepage