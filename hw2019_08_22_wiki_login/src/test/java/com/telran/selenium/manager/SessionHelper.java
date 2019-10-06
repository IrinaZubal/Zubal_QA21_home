package com.telran.selenium.manager;

import com.telran.selenium.manager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickLogin() {
        click(By.id("wpLoginAttempt"));
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("wpName1"), email);

        type(By.id("wpPassword1"), password);
    }

    public boolean isWikiHomePageOpened() {
        return isElementPresent(By.xpath("//a[@class='mw-wiki-logo']"));
    }

    private boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}
