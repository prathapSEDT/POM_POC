package com.genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WebLib {
   public static WebDriver driver;
   public static SoftAssert softAssert=new SoftAssert();

   private static Actions actions;
   Logger logger=Logger.getLogger(WebLib.class.getName());
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        actions=new Actions(driver);
    }

    public String getPageTitle(){
        logger.log(Level.INFO,"Getting page title");
        return driver.getTitle();
    }

    public boolean checkElementExist(WebElement element, String pageName, String elementName){
        boolean status =false;
        logger.log(Level.INFO,"Finding element : "+elementName+" on the page :"+pageName);
        try{
            if(element.isDisplayed()){
                status=true;
            }
        }catch (Exception e){
            logger.log(Level.SEVERE,"Unable to locate element : "+elementName+" on the page :"+pageName);
        }
        return status;
    }


    public void enterData(WebElement element,String data){
        element.click();
        element.clear();
        element.sendKeys(data);
    }

    public void clickElement(WebElement element){
       actions.moveToElement(element).click(element).build().perform();

    }

    public void checkError(){
        softAssert.assertAll();
    }


}
