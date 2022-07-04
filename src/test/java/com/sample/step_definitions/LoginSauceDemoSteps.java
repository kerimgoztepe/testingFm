package com.sample.step_definitions;

import com.sample.pages.LoginPageSauceDemo;
import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginSauceDemoSteps extends CommonSteps {

    LoginPageSauceDemo loginPageSauceDemo = new LoginPageSauceDemo();


    @Given("user logins to platform with username and password")
    public void user_logins_to_platform_with_and() {

        // LOGIN STEPS FOR saucedemo website
        driver.get("https://www.saucedemo.com/");
        //  Login("standard_user", "standard_user");

        //loginPageSauceDemo.Login("standard_user","secret_sauce");
        loginPageSauceDemo.userName.sendKeys("standard_user");
        loginPageSauceDemo.passWord.sendKeys("secret_sauce");
        loginPageSauceDemo.loginButton.click();




        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("login-button")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //loginPageSauceDemo.Login("standard_user","secret_sauce");
        throw new io.cucumber.java.PendingException();
    }





    @Then("the user should see inventory page")
    public void the_user_should_see_inventory_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
