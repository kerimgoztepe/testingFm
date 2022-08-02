package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;

public class SauceDashBoardPage extends CommonPageElements{

    @FindBy(id = "react-burger-menu-btn")
    public WebElement mainMenuButton;

    @FindBy(id = "about_sidebar_link")
    public WebElement aboutButton;


}
