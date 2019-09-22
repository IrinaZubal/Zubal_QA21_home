package com.telran.selenium;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    public static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUP(){
        app.init();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }

}
