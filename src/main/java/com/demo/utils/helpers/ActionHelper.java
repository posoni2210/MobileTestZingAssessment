package com.demo.utils.helpers;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.inject.Inject;

public class ActionHelper {
    public WebDriverWait webDriverWait;
    public AppiumDriver appiumDriver;

    @Inject
    public ActionHelper(AppiumDriver appiumDriver){
        this.appiumDriver=appiumDriver;
    }

    public Boolean checkPresenceOfElement(By locator){
        try {
            webDriverWait = new WebDriverWait(appiumDriver, 30);
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void scrollGesture(AppiumDriver driver){
        boolean canScrollMore = true;
        while(canScrollMore){
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "direction", "down",
                    "percent", 1.0
            ));
            System.out.println(canScrollMore);
        }
    }
}
