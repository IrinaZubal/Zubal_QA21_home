package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase{
    @Test

public void loginTest() throws InterruptedException {

        openSite("https://en.wikipedia.org");

        initLogin();

        fillLoginForm("user123@test.com", "Test123");

        clickLogin();


        Thread.sleep(10000);

}


}
