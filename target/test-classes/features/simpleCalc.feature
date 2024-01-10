Feature: SimpleCalc functionality test

  Scenario: Adding two integers
    Given I have two integers 4 and 1
    When I add them
    Then expected result should be 5

  Scenario: Multiplying two doubles
    Given I have two doubles 6.0 and 1.0
    When I multiply them
    Then the result should be 6.0

  Scenario: Sum of even array elements
    Given I have an array with elements 1, 2, 3, 4, 5, 6
    When I calculate the sum of even elements
    Then result will be 12