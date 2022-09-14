package com.testdataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "invalid")
    public Object[][] getUserDetails(){
        Object[][] userDetails=new Object[3][2];
        userDetails[0][0]="tyuu@gmail.com";
        userDetails[0][1]="pwd234";

        userDetails[1][0]="yhgf@gmail.com";
        userDetails[1][1]="pwd234";


        userDetails[2][0]="tabcg@gmail.com";
        userDetails[2][1]="pwd234";

        return userDetails;
    }

}
