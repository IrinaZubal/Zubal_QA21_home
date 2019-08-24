package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase{
    @Test

public void loginTest() throws InterruptedException {

driver.get("https://en.wikipedia.org");

        click(By.id("pt-login"));

        click(By.id("wpName1"));
        clear(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).sendKeys("user123@test.com");

        click(By.id("wpPassword1"));
        clear(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).sendKeys("Test123");

        click(By.id("wpLoginAttempt"));


        Thread.sleep(10000);

}

    public void clear(By id) {
        driver.findElement(id).clear();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


}
