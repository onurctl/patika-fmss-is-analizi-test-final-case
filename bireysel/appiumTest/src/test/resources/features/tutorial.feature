Feature: Tutorial Page Functionality

  # basic page check - smoke:

  Background:
    Given User on Tutorial page

  # (4)

  @tutorialSmoke
  Scenario: Tutorial page check
    Then observe the "Let's take a tour about RENTfy!" text

  #

  @tutorialAction
  Scenario: Start button functionality on tutorial page
    And click "Start" button on tutorial page
    Then observe the "RENTfly offers you a fast and easy car rental experience thanks to its innovative approaches." text

  #

  @tutorialAction
  Scenario: Skip Tour button functionality on tutorial page
    And click "Skip Tour" button on tutorial page
    Then observe the "RENTfly" text on Main page

  #

  @tutorialAction
  Scenario: Start and Skip Tour button functionality on tutorial page
    And click "Start" button on tutorial page
    And click "Skip Tour" button on tutorial page
    Then observe the "RENTfly" text on Main page

