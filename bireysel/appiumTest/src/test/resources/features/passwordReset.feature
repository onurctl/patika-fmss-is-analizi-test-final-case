Feature: Reset Password Page Functionality

  Background:
    Given User on Tutorial page
    When click "Skip Tour" button
    And click "Already have an account?" button
    And click "Forgot Password?" link

  # (1)

  @passwordPageSmoke
  Scenario Outline: Input areas check
    Then observe "<input1>" password reset area
    Examples:
      | input1     |
      | Email      |

  # database (2):.......................................................................................................

  # NOT NULL fields & validation: ......................................................................................

  @resetPasswordPageDB
  Scenario Outline: Empty mail address check
  Then enter rest "<email>" info
  And see the "Field cannot be left blank!" message for reset
  Examples:
    | email          |
    |                |

  @resetPasswordPageDB
  Scenario Outline: Empty mail address check
    Then enter reset "<email>" info
    And see the "Enter valid & registered mail address!" message for reset
    Examples:
      | email          |
      | ad@gmail.com   |
      | ad@gmailcom    |
      | adgmail.com    |
      | @gmail.com     |

