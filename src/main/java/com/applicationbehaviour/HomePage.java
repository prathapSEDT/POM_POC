package com.applicationbehaviour;

import com.applicationor.BaseOR;
import com.applicationor.HomePage_OR;
import com.genericmethods.WebLib;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebLib {

    HomePage_OR homePage_or;
    public HomePage(){
        this.homePage_or= PageFactory.initElements(driver,HomePage_OR.class);
    }

    @Step("Clicking on sigin  on home page")
    public void clickSignIn(){
        homePage_or.signin.click();
    }



}
