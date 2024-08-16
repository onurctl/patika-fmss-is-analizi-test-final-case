Feature: Login Page Functionality

  Background:
    Given User on Tutorial page
    When click "Skip Tour" button
    And click "Already have an account?" button

  # (4)

  @loginPageSmoke
  Scenario Outline: Input areas check
    Then observe "<input1>" login area
    And observe "<input2>" login area
    Examples:
      | input1     | input2    |
      | Email      | Password  |

  #

  @loginPageAction
  Scenario: Forgot password check
    When click "Forgot Password?" link on Login page
    Then observe the "Reset Password" title

  #

  @loginPageAction
  Scenario: Continue with Google Account
    When click "Continue with Google" button on Login page
    Then observe the "Use a Google account to sign up and log in." title

  #

  @loginPageAction
  Scenario: Need an Account
    When click "Need an account" button on Login page
    And choose "Personal" option on Account Type page
    Then observe the "Create An Account" title

  # database: (3) ......................................................................................................

  # Incorrect fields: ..................................................................................................

  @loginPageDB
  Scenario Outline: Incorrect password check
    Then enter "<email>" info for login
    And enter "<password>" info for login
    And click "Login" button on Login page
    And see the "Incorrect password!" message
    Examples:
      | email          | password    |
      | abc@gmail.com  | 123mlA--    |

  @loginPageDB
  Scenario Outline: Incorrect mail address check
    Then enter "<email>" info for login
    And enter "<password>" info for login
    And click "Login" button on Login page
    And see the "Account not found!" message
    Examples:
      | email          | password    |
      | aff@gmail.com  | 123mlA-1    |

  # Empty fields: ......................................................................................................

  @loginPageDB
  Scenario Outline: Incorrect mail address check
    Then enter "<email>" info for login
    Then enter "<password>" info for login
    And click "Login" button on Login page
    And see the "Fields cannot be left blank!" message
    Examples:
      | email          | password    |
      |                | 123mlA-1    |
      | abc@gmail.com  |             |


