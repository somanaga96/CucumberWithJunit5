Feature: Login to cricbuzz

  @india
  Scenario Outline: Get the "<country>" cricket players names
    Given user logins to cricbuzz
    When user select "<country>"
    Examples:
      | country |
      | India   |

