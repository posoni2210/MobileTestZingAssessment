package com.demo.utils.helpers;

import com.demo.config.AppiumDriverProvider;
import com.demo.config.driver.AppDriver;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionHelper {
    public WebDriverWait webDriverWait;
    public AppiumDriver appiumDriver;


    public ActionHelper(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public Boolean checkPresenceOfElement(By locator) {
        try {
            webDriverWait = new WebDriverWait(AppDriver.getDriver(), 30);
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public WebElement findElement(By locator) {
        return AppDriver.getDriver().findElement(locator);

    }

    public void scrollGesture(By WebLocator) {

        boolean canScrollMore = true;

        canScrollMore = (Boolean) AppiumDriverProvider.sessionDriver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "elementId", ((RemoteWebElement) findElement(WebLocator)).getId(),
                        "direction", "down",
                        "percent", 0.75
                )
        );
        System.out.println(canScrollMore);
    }
}
