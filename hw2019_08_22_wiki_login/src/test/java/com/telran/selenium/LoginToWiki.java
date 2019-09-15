package com.telran.selenium;

import org.testng.annotations.Test;

public class LoginToWiki extends TestBase{
    @Test

public void loginTest() throws InterruptedException {

        app.openSite("https://en.wikipedia.org");

        app.initLogin();

        app.fillLoginForm("user123@test.com", "Test123");

        app.clickLogin();


        Thread.sleep(10000);

}


}
