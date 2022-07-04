package com.sample.step_definitions;

import com.sample.pages.SauceDashBoardPage;
import com.sample.pages.SauceDemoLoginPage;
import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SauceDemoLoginSteps extends CommonSteps {

    SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage();


    @Given("user logins to platform with username and password")
    public void user_logins_to_platform_with_and() {

        // LOGIN STEPS FOR saucedemo website
        driver.get("https://www.saucedemo.com/");
        //  Login("standard_user", "standard_user");

        //loginPageSauceDemo.Login("standard_user","secret_sauce");
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


    @Then("the user should see inventory page")
    public void the_user_should_see_inventory_page() {

        // LOGIN STEPS FOR saucedemo website
        driver.get("https://www.saucedemo.com/");
        //  Login("standard_user", "standard_user");

        //loginPageSauceDemo.Login("standard_user","secret_sauce");
        sauceDemoLoginPage.userName.sendKeys("standard_user");
        sauceDemoLoginPage.passWord.sendKeys("secret_sauce");
        sauceDemoLoginPage.loginButton.click();

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Swag Labs";
        Assert.assertEquals(ExpectedTitle,ActualTitle);




        // Write code here that turns the phrase above into concrete actions

    }


}
