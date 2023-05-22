
Feature: Users should be able to login

Scenario: Login to app
    Given the user is on the login page
    When the user enters his credentials
    Then the user should be able to login