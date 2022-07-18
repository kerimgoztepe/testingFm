package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationSummerDress extends CommonPageElements{

    @FindBy(xpath = "//li//a[normalize-space()='Summer Dresses']")
    public WebElement summerDress;

}
