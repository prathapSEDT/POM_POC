package com.annotations;

import com.genericmethods.WebLib;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestAnnotations {
    WebLib webLib=new WebLib();
    @BeforeSuite
    public void beforeSuite(){

        webLib.launchBrowser();
    }

    @AfterMethod
    public void afterMethod(){
        webLib.checkError();
    }
}
