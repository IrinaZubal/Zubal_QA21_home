package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    SessionHelper sessionHelper;
    HelperBase helperBase;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        sessionHelper = new SessionHelper(driver);
        helperBase = new HelperBase(driver);

    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public HelperBase getHelperBase() {
        return helperBase;
    }

    public void stop() {
        driver.quit();
    }

}
