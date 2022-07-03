package com.sample.step_definitions;

import com.sample.utilities.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.dvcs.DVCSRequestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemoMain extends CommonSteps {

    @Given("user logins to platform")
    public void user_logins_to_platform(String user, String passWord) {
        // Write code here that turns the phrase above into concrete actions

        WebDriver driver = new ChromeDriver();
        String link = ("https://www.saucedemo.com/");
        driver.get(link);
        driver.findElement(user).sendKeys();


        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see inventory page")
    public void the_user_should_see_inventory_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
