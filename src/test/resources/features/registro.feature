Feature: global sqa as a web user I need register for know friends

  Scenario Outline: register successfully
    Given that i enter on the website
    When i enter personal data
      | name   | email   |
      | <name> | <email> |
    Then i should see on the screen Thanks For Your Money


    Examples:
      | name | email              |
      | luna | lunagp03@gmail.com |
      | Sara | sara@gmail.com     |
      | Anni | anni@gmail.com     |
