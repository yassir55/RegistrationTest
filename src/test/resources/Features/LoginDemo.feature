Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credientials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to home page

    Examples:

      | username | password |
      | zakaria | 12345 |
      | mohamed | 12345 |