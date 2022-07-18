package com.sample.step_definitions;
import com.sample.utilities.CommonSteps;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationPraStepDef extends CommonSteps {

    @Given("user is on the main page {string}")
    public void user_is_on_the_main_page(String string) {
        Driver.get().get("http://automationpractice.com/index.php");

    }


    @When("user navigates to summer dresses page")
    public void userNavigatesToSummerDressesPage() throws InterruptedException {
       //Driver.get().findElement(By.xpath("//li//a[normalize-space()='Summer Dresses']")).click();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3,5).getSeconds());
       WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li//a[normalize-space()='Summer Dresses']")));
        Thread.sleep(2000);
        element.click();


    }
}
