package com.sample.automationPractice;

import com.sample.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.sample.utilities.Driver.driver;

public class SampleTests {
    @Test
    public void test1() throws InterruptedException {
        Driver.get().get("http://automationpractice.com/index.php");

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Dresses'])[2]")));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        WebElement summerDress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Summer Dresses'])[2]")));
        summerDress.click();

        List<WebElement> addToChart = driver.findElements(By.xpath("//span[text()='Add to cart']"));
        addToChart.get(0).click();
        Thread.sleep(10);

        WebElement proceedToCheckOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Proceed to checkout']")));
        proceedToCheckOut.click();

        WebElement proceedToCheckOut2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium")));
        proceedToCheckOut2.click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Sign in']"))).isDisplayed());

        driver.close();


    }

    @Test
    public void testLogin() {

        Driver.get().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        WebElement userName = Driver.get().findElement(By.id("email"));
        userName.sendKeys("advancedscientificw@gmail.com");

        WebElement passWord = Driver.get().findElement(By.name("passwd"));
        passWord.sendKeys("Test123++");

        WebElement signIn = Driver.get().findElement(By.xpath("//span[normalize-space()='Sign in']"));
        signIn.click();

        String ActualTitle = Driver.get().getTitle();
        String ExpectedTitle = "My account - My Store";

        Assert.assertEquals(ActualTitle,ExpectedTitle);

        //Assert.assertNotEquals(ActualTitle, ExpectedTitle);
        System.out.println("Title of the page is = " + ActualTitle);

        Driver.get().close();


    }

}
