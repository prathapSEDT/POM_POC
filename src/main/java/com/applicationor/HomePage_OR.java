package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_OR   {
@FindBy(xpath="//a[normalize-space(text())='Sign in']")
    public WebElement signin;
}
