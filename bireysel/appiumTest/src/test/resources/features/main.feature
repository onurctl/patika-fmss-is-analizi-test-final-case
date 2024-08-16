Feature: Main Page Functionality

  Background:
    Given User on Tutorial page
    And click "Skip Tour" button
    Then User on Main page

  # (7)

  @mainPageSmoke
  Scenario: Motto text check
    Then observe the "Rent and Drive Like You Fly" title

  #

  @mainPageAction
  Scenario: Privacy Policy page check
    When click "Privacy Policy" link
    Then observe the "Privacy Policy" title

  #

  @mainPageAction
  Scenario: Terms of Service page check
    When click "Terms of Service" link
    Then observe the "Terms of Service" title

  #

  @mainPageAction
  Scenario: Continue with Google Account
    When click "Continue with Google" button
    Then observe the "Use a Google account to sign up and log in." title

  #

  @mainPageAction
  Scenario Outline: Sign up with Email
    When click "Sign Up with Email" button
    Then observe "<option1>" button
    And observe "<option2>" button
    Examples:
      | option1     | option2    |
      | Personal    | Company    |

  #

  @mainPageAction
  Scenario: Sign up with Email
    When click "Sign Up with Email" button
    And choose "Personal" option on Account Type page
    Then observe the "Create An Account" title

  #

  @mainPageAction
  Scenario: Go to Login page
    When click "Already have an account?" link
    Then observe the "Login With Email" title

