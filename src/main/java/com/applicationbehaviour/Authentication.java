package com.applicationbehaviour;

import com.applicationor.Authentication_OR;
import com.applicationor.HomePage_OR;
import com.genericmethods.WebLib;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Authentication extends WebLib {

    Authentication_OR authentication_or;
    public Authentication(){
        this.authentication_or= PageFactory.initElements(driver,Authentication_OR.class);
    }

    public void validAuthenticationPageTitle(){
       String pageTitle= getPageTitle();
        Assert.assertEquals(true,pageTitle.startsWith("Login"));
    }

    public void checkAuthenticationHeader(){
        boolean status=checkElementExist(authentication_or.authenticationHeader,"Authentication","Authentication Header");
        Assert.assertEquals(true, status,"Authentication header not found");
    }

    public void validateUserLogin(String userName, String password){
       enterData(authentication_or.userName,userName);
        enterData(authentication_or.password,password);
        clickElement(authentication_or.signin);
        boolean status= checkElementExist(authentication_or.authenticationError,"Authentication","Authentication Header");
        softAssert.assertEquals(true,status,"Invalid user name : "+userName);
    }


}
