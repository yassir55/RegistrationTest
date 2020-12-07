Feature: Registration Form

  Scenario Outline: Valid Registration
    Given The user is on the registration page
    When user enters <full_name>
    And user enters <email>
    And user enters <password>
    And user enters <date_of_bithday>
    And user cboose the <country>
    And user select the <gender>
    And user check meal_preference <calorie>
    And user check meal_preference <salt>
    And user check I accept terms
    And user click on Register
    Then a succes message should display

    Examples: 
      | full_name | email             | password | country | gender | calorie | salt  |
      | mohamad   | mohamed@gmail.con | 147     | Fiji    | male   | true    | flase |
