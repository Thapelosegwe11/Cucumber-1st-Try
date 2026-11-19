Feature: Login

  Scenario Outline: Login to Ndosi Automation Website
    Given I am on the home page of the website
    And I click login button
    And I enter username <username>
    And I enter password <password>
    When I click submit button
    Then I should be logged in successfully

    Examples:
      | username | password |
      | Jamesbonds@example.com    | @12345678    |
    #  | user2    | pass2    |

