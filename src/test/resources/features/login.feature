@Regression  @Login
Feature: This is a test feature

  @smoke
  Scenario Outline: Login
    Given "student" logs in to the platform
    Then "Dashboard"page should be displayed
    Examples:
