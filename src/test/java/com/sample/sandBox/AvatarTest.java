package com.sample.sandBox;

import com.sample.utilities.CommonSteps;
import com.sample.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.sample.utilities.Driver.driver;

public class AvatarTest {
    @Test
    public void testAvatar() throws InterruptedException {
        String baseUrl = "https://www.sandbox.game/en/";
        WebDriver driver = Driver.get();

       // Driver.get().get("https://www.sandbox.game/en/");  //another way for calling web site
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);
        Thread.sleep(5000);

        WebElement signIn = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
        CommonSteps.clickWithJS(driver.findElement(By.xpath("//button[normalize-space()='Sign In']")));
        WebDriverWait wait1 = new WebDriverWait(driver,10);
        signIn.click();

        WebElement signInWithEmail = driver.findElement(By.xpath("//p[@class='link']"));
        signInWithEmail.click();

        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Your username or email']"));
        userName.sendKeys("qatest");

        WebElement passWord =driver.findElement(By.xpath("//input[@placeholder='Your password']"));
        passWord.sendKeys("qatest123!");

        WebElement loginSmall =driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginSmall.click();

        WebElement createAvatar = driver.findElement(By.xpath("//button[@class='small no-capitalize discover-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='small no-capitalize discover-button']")));
        createAvatar.click();

        WebElement preDesigned = driver.findElement(By.xpath("(//div[@class='item item-asset'])[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='item item-asset'])[1]")));

        preDesigned.click();

        WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save changes']"));
        saveButton.click();

        WebElement avatarPopup = driver.findElement(By.xpath("//*[normalize-space()='Avatar was updated successfully"));
        Assert.assertTrue(avatarPopup.isDisplayed());

        /*
        BrowserUtils.clickWithJS(driver.findElement(By.xpath("//button[normalize-space()='Sign In']")));
        BrowserUtils.clickWithJS(driver.findElement(By.xpath("//p[normalize-space()='Sign in with email >']")));
        driver.findElement(By.xpath("//[@placeholder='Your username or email']")).sendKeys("qatest");
        driver.findElement(By.xpath("//[@placeholder='Your password']")).sendKeys("qatest123!");
        driver.findElement(By.xpath("//*[@placeholder='Your password']")).sendKeys("qatest123!");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
         */


        }



    }




