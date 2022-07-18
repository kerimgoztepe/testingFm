package com.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class SauceDemoLoginPage extends CommonPageElements {

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}

