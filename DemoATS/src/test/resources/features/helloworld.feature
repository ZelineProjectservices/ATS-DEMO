Feature: HelloWorld Feature

  Scenario: Display Hello World
    Given I have a greeting
    When I say hello
    Then I should see the greeting
