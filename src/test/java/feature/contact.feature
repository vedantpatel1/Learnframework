#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Signup button testing

  @tag1
  Scenario Outline: Clicking on signup button on homepage
    Given user must be on homepage "https://demoblaze.com/"
    When user click on signup button
    Then Signup dialog box should open
    And user enter <username> and <password>

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
