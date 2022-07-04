package com.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginPageSauceDemo extends CommonPageElements{

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void Login(String userN, String passW) {
        Login("standard_user", "standard_user");

        userName.sendKeys("standard_user");
        passWord.sendKeys("ecret_sauce");
        loginButton.click();

        loginButton.click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



    }
}
