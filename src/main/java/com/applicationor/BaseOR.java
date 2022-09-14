package com.applicationor;

import com.genericmethods.WebLib;
import org.openqa.selenium.support.PageFactory;

public class BaseOR{
    public static BaseOR baseor;
    public BaseOR(){
       baseor= PageFactory.initElements(WebLib.driver,this.getClass());
    }

}
