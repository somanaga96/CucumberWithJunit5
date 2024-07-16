Feature: Login to cricbuzz

  Scenario Outline: Get the indian cricket players names
    Given user logins to cricbuzz
    When user select "<country>"
    Examples:
      | country |
      | India   |
      | Oman    |