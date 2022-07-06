@asserttests
Feature: ASSERT TRUE examples

  @asserttest1
  Scenario: assert test
    Given user navigates to a website
    #https://www.browserstack.com/
    Then user verifies title of the page
