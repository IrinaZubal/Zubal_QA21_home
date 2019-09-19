package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }


    public void type(By locator, String text) {
        click(locator);
        clear(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void clear(By locator) {
        driver.findElement(locator).clear();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
