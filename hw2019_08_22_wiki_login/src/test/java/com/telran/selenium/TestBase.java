package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUP(){
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

@AfterMethod
    public void tearDown(){
driver.quit();
}

    public void clickLogin() {
        click(By.id("wpLoginAttempt"));
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("wpName1"), email);

        type(By.id("wpPassword1"), password);
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
