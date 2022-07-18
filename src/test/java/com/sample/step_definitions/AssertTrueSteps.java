package com.sample.step_definitions;

import com.sample.utilities.CommonSteps;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTrueSteps extends CommonSteps {

    @Given("user navigates to a website")
    public void user_navigates_to_a_website() {

        //WebDriver driver1 = new ChromeDriver();
        Driver.get().get("https://www.browserstack.com/");
        String ActualTitle = Driver.get().getTitle();
        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        Assert.assertEquals(ExpectedTitle, ActualTitle);


    }
}




