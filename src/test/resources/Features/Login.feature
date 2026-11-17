Feature: Login

  Scenario: Login to Ndosi Automation Website
    Given I am on the home page of the website
    And I click login button
    And I enter username
    And I enter password
    When I click submit button
    Then I should be logged in successfully