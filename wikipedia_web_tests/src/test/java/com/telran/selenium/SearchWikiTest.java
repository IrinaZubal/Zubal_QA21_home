package com.telran.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {

    WebDriver driver;
    @Test
public void SearchWikiTest() throws InterruptedException {
driver = new ChromeDriver();
driver.get("https://en.wikipedia.org");
driver.findElement(By.name("search")).sendKeys("java");
driver.findElement(By.name("go")).click();
Thread.sleep(8000);
driver.quit();

    }

}
