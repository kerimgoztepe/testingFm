package com.sample.step_definitions;

import com.sample.utilities.CommonSteps;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BbcLoginSteps extends CommonSteps {
    @Given("user navigates to BBC website")
    public void userNavigatesToBBCWebsite() {

        Driver.get().get("https://www.bbc.co.uk/");

        String ActualTitle = Driver.get().getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "BBC - Home";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @When("user enter correct credentials")
    public void userEnterCorrectCredentials() {
    }

    @Then("user should see home page")
    public void userShouldSeeHomePage() {
    }
}