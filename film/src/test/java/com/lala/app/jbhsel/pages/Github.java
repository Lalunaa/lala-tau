package com.lala.app.jbhsel.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Github extends WebDriverPage {

    public Github(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        get("https://github.com/Lalunaa");
        manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    public void click(String linkText) {
        WebElement e = findElement(By.partialLinkText(linkText));
        e.click();
    }

    public boolean isPresent(String linkText) {
        try {
            WebElement e = findElement(By.partialLinkText(linkText));
            if(e.isDisplayed()) return true;
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
