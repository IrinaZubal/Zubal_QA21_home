//package com.telran.selenium.tests;
//
//import com.telran.selenium.manager.TestBase;
//import org.openqa.selenium.By;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class SearchWikiTests extends TestBase {
//    @BeforeMethod
//    public void isOnHomePage () {
//        if (!app.getSessionHelper().isWikiHomePageOpened()) {
//            app.getSessionHelper().openSite("https://en.wikipedia.org");
//        }
//    }
//
//
//    @Test
//        public void SearchWikiTest() throws InterruptedException {
//        app.getSessionHelper().openSite("https://en.wikipedia.org");
//        app.getHelperBase().search("Java");
//        app.getHelperBase().initSearch();
//
//        }
//
//    @AfterMethod
//    public void postAction() throws InterruptedException {
//        app.getSessionHelper().openSite("https://en.wikipedia.org");
//        Thread.sleep(5000);
//    }



}
