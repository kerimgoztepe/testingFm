Feature: sample web site test
  #login test for https://www.saucedemo.com/

  @test1 @login
  Scenario: login test
    Given user logins to platform
    Then the user should see inventory page