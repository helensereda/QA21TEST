
Feature: E2E Test

  Scenario: Successful purchase
    Given start browser
    * open login page
    When user enter username standard_user and password secret_sauce
    * user clicks login button
    Then products page is displayed
    * user click add to cart
    * user click shopping cart button
    Then your cart page is displayed
    * user click checkout button
    Then checkout page is displayed
    When user enter firstname Helen lastname Sereda and zipcode 123
    When user click continue checkout
    Then checkoutover page is displayed
    * user click finish button
    Then checkoutcomplete page is displayed
    * user click back home button
