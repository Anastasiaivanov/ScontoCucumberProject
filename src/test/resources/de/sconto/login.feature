Feature: Sconto Login Feature
  In order to see the user area
  I log in to the website

  Scenario: Successful Login
    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page
    When I insert valid user credentials
    And I click on Login button
    Then I should see Homepage
    When I click on the Login icon
    Then I should be logged in

  Scenario Outline: Successful login with credentials
    Given I am on the Login Page
    When I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    And I click on Login button
    Then I should see Homepage
    When I click on the Login icon
    Then I should be logged in

    Examples: Credentials
      | email             | password  |
      | rusaldo@mail.com  | Rusaldo1! |
      | rusaldo1@mail.com | Rusaldo2! |
      | rusaldo2@mail.com | Rusaldo3! |
