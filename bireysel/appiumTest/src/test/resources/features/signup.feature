Feature: Sign Up Page Functionality

  Background:
    Given User on Tutorial page
    When click "Skip Tour" button
    And click "Sign Up with Email" button
    And choose "Personal" option on Account Type page

  # (6)

  @signUpPageSmoke
  Scenario Outline: Input areas check
    Then observe "<input1>" signup area
    And observe "<input2>" signup area
    And observe "<input3>" signup area
    And observe "<input4>" signup area
    And observe "<input5>" signup area
    Examples:
    | input1     | input2    | input3 | input4   | input5 |
    | First Name | Last Name | Email  | Password | Phone  |

  #

  @signUpPageAction
  Scenario: Terms of Service page check
    When click "Terms of Service" link on signup page
    Then observe the "Terms of Service" title

  #

  @signUpPageAction
  Scenario: Privacy Policy page check
    When click "Privacy Policy" link on signup page
    Then observe the "Privacy Policy" title

  #

  @signUpPageAction
  Scenario: Terms of Service agreement acceptance
    When click "Terms of Service" link on signup page
    Then click "Accept" button on Privacy Policy page

  #

  @signUpPageAction
  Scenario: Privacy Policy agreement acceptance
    When click "Privacy Policy" link on signup page
    Then click "Accept" button on Privacy Policy page

  #

  @signUpPageAction
  Scenario: Go to Login page
    When click "Already have an account?" button on signup page
    Then observe the "Login With Email" title

  # database: (7) ......................................................................................................

  # Fields that cannot be empty (NOT NULL): ............................................................................

  @signUpPageDB
  Scenario Outline: Empty input areas check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Fields cannot be left blank!" message for signup
    Examples:
      | firstName     | lastName    | email               | password   | phone       |
      | Onur          | Catal       |                     | 123mlA-1   | 05678901122 |
      |               | Catal       |  abc@gmail.com      | 123mlA-1   | 05678901122 |
      | Onur          |             |  abc@gmail.com      | 123mlA-1   | 05678901122 |
      | Onur          | Catal       |  abc@gmail.com      |            | 05678901122 |

  # UNIQUE fields check: ...............................................................................................

  @signUpPageDB
  Scenario Outline: Unique phone number check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Enter an unregistered phone number!" message for signup
    Examples:
      | firstName     | lastName    | email                 | password   | phone       |
      | Onur          | Catal       |  abrfc@gmail.com      | 123mlA-1   | 05678901122 |

  @signUpPageDB
  Scenario Outline: Unique mail address check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Enter an unregistered mail address!" message for signup
    Examples:
      | firstName     | lastName    | email               | password   | phone       |
      | Onur          | Catal       |  abc@gmail.com      | 123mlA-1   | 05678908790 |

  # password requirements: .............................................................................................

  @signUpPageDB
  Scenario Outline: Password requirements check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Password must be at least 8 characters. It must contain at least one uppercase and lowercase letter and a special character." message for signup
    Examples:
      | firstName     | lastName    | email               | password   | phone        |
      | Onur          | Catal       |  wdw@gmail.com      | 123mlA-    | 05678901122  |
      | Onur          | Catal       |  wdw@gmail.com      | 123mla-x   | 05678901122  |
      | Onur          | Catal       |  wdw@gmail.com      | 123ALP-T   | 05678901122  |
      | Onur          | Catal       |  wdw@gmail.com      | 123cLP7T   | 05678901122  |

  # invalid data types: ................................................................................................

  @signUpPageDB
  Scenario Outline: Phone requirements check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Phone number must be 11 digits and must not contain alphabetical values." message for signup
    Examples:
      | firstName     | lastName    | email               | password    | phone        |
      | Onur          | Catal       |  asd@gmail.com      | 123mlA-1    | 05678901122  |
      | Onur          | Catal       |  ewd@gmail.com      | 123mlA-1    | 05678901122  |
      | Onur          | Catal       |  sdc@gmail.com      | 123mlA-1    | 05678901122  |

  @signUpPageDB
  Scenario Outline: Name fields requirements check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Numeric characters cannot be entered in name fields." message for signup
    Examples:
      | firstName     | lastName    | email               | password    | phone       |
      | o123          | Catal       |  egb@gmail.com      | 123mlA-1    | 05678901122 |
      | Onur          | cat12       |  cef@gmail.com      | 123mlA-1    | 05678901122 |

  @signUpPageDB
  Scenario Outline: Mail field requirements check
    Then enter "<firstName>" info
    And enter "<lastName>" info
    And enter "<email>" info
    And enter "<password>" info
    And enter "<phone>" info
    And click "Sign Up" button on signup page
    And see the "Enter a valid mail address!" message for signup
    Examples:
      | firstName     | lastName    | email               | password   | phone       |
      | Onur          | Catal       |  abcgmail.com       | 123mlA-1   | 05678901122 |
      | Onur          | Catal       |  abc@gmailcom       | 123mlA-1   | 05678901122 |
      | Onur          | Catal       |  @gmail.com         | 123mlA-1   | 05678901122 |


