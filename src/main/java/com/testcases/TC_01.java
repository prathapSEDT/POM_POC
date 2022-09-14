package com.testcases;

import com.annotations.TestAnnotations;
import com.applicationbehaviour.Authentication;
import com.applicationbehaviour.HomePage;
import com.testdataproviders.LoginDataProvider;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TC_01 extends TestAnnotations {

   @Test(testName = "Navigate to Authentication Page",priority = 1)
   @Story("US-003")
    @Feature("User Registartion")
    @Severity(SeverityLevel.CRITICAL)
    public void userLogin(){
        HomePage homePage=new HomePage();
        homePage.clickSignIn();
        Authentication authentication=new Authentication();
        authentication.validAuthenticationPageTitle();
        authentication.checkAuthenticationHeader();
    }

    @Test(dataProviderClass = LoginDataProvider.class,dataProvider = "invalid",priority = 2,dependsOnMethods ="userLogin" )
    public void validateUserCredentials(String userName,String password){
        Authentication authentication=new Authentication();
        authentication.validateUserLogin(userName,password);
    }
}
