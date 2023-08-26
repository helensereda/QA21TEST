
Feature: Validation login functionality

  Scenario: User bues 1 item
    Given start browser
    * open login page
    When user enter username standard_user and password secret_sauce
    Then products page is displayed

