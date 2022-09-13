package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IbmLoginPage extends CommonPageElements{

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;
}
