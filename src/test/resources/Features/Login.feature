Feature: Login the app
  As a user
  I want to login app
  So that I can check app

  @test
  Scenario: Login app and proceed till CheckOut page
    Given the user is on the Home page
      When the user select a product on Home page
      And the user click AddToCart on Product page
      And the user click cart icon on Product page
    Then the user is on the My cart page
      When the user click ProceedToCheckout on the My cart page
    Then the user is on the Login Page
      When the user enters credentials on the Login screen
      And the user clicks Login button on the Login screen
    Then the user is on the Checkout page


