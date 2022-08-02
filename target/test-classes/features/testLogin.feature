@login
Feature: sample web site test
  #login test for https://www.saucedemo.com/

  @test1 @login
  Scenario: login test
    Given user logins to platform with username and password
    When user clicks on main menu button

    #Then the user should see inventory page
