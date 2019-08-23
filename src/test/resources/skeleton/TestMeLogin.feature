Feature: Validations on TestMeApp

  @Smoke
  Scenario Outline: TestMeApp registration
    Given Application is launched
    Then user clicks on SignUp button
    Then user provides all fields "<UserName>" "<FirstName>" "<LastName>" "<Password>" "<ConfirmPassword>" "<Email>" "<MobileNo>" "<DOB>" "<Address>" "<Answer>"
    And user clicks on Register button

    Examples: 
      | UserName     | FirstName | LastName | Password | ConfirmPassword | Email                  | MobileNo   | DOB        | Address    | Answer |
      | pavanvarma   | pavan     | varma    | Pava123  | Pava123         | pavanvarma@gmail.com   | 8897415373 | 09/27/1997 | vizag      |        |
      | kiranprakash | kiran     | prakash  | Kiran123 | Kiran123        | kiranprakash@gmail.com | 9908765301 | 09/19/1996 | hyd        |        |
      | bhanupraveen | banu      | praveen  | Banu123  | Banu123         | banupraveen@gmail.com  | 9346743889 | 08/20/1999 | vijayawada |        |

  @Sanity
  Scenario Outline: Login validations by registered User
    Given User has launched the application
    Then User enters the valid credentials "<UserName>" "<Password>"
    And User clicks on submit button
    Then User verifies the login status

    Examples: 
      | UserName | Password    |
      | Lalitha  | Password123 |

  @Sanity
  Scenario: Purchase a product
    When user search on a serach tab
    Then user enter a product name
    And user selects product from dropdown
    Then user adds the product to cart
    And user does the payment

  @Sanity
  Scenario: User moves to cart without adding any items to it
    Given Launch the application
    When user clicks the login
    Then user enters credentials
    And clicks on login
    Then search a particular product
    And proceed to pay without adding any item to cart
    Then application does not display the cart icon
