package com.telran.selenium.tests;

import com.telran.selenium.manager.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
     @BeforeMethod
     public void isOnHomePage () {
             if (!app.getSessionHelper().isWikiHomePageOpened()) {
                     app.getSessionHelper().openSite("https://en.wikipedia.org");
             }
     }

    @Test
public void loginTest() throws InterruptedException {

             app.getSessionHelper().initLogin();
             app.getSessionHelper().fillLoginForm("user123@test.com", "Test123");
             app.getSessionHelper().clickLogin();

             Thread.sleep(10000);

}
@AfterMethod
        public void postAction(){
             app.getSessionHelper().openSite("https://en.wikipedia.org");
}



}
