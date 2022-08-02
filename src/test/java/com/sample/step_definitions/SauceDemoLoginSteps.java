package com.sample.step_definitions;


import com.sample.pages.SauceDemoLoginPage;
import com.sample.utilities.CommonSteps;

import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.junit.Assert.assertEquals;

public class SauceDemoLoginSteps extends CommonSteps {

    SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage();


    @Given("user logins to platform with username and password")
    public void user_logins_to_platform_with_and() {

        // LOGIN STEPS FOR saucedemo website
        driver.get("https://www.saucedemo.com/");
        //Driver.get().get("https://www.saucedemo.com/");
        //we can use also Driver.get().get method...
        // Driver and driver...there two are defined in Driver class

        sauceDemoLoginPage.userName.sendKeys("standard_user");
        sauceDemoLoginPage.passWord.sendKeys("secret_sauce");
        sauceDemoLoginPage.loginButton.click();



       //basic test codes are given below. they can be used without cucumber
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("login-button")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //loginPageSauceDemo.Login("standard_user","secret_sauce");

    }


    @Then("user verifies title of the page")
    //getting page title
    public void userVerifiesTitleOfThePage() {

        String actualTitle = driver.getTitle();
        //String actual1 = Driver.get().getTitle(); same as above
        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        assertEquals(expectedTitle,actualTitle);
        //assertTrue(driver.getTitle().contains("Title of Page"));

        /*
        driver.close();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Swag Labs";
        Assert.assertEquals(ExpectedTitle,ActualTitle);

         */

    }

    @When("user clicks on main menu button")
    public void userClicksOnMainMenuButton() {
        sauceDemoLoginPage.loginButton.click();
    }
}

