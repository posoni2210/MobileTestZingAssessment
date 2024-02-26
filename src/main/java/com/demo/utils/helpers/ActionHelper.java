package com.demo.utils.helpers;

import com.demo.config.AppiumDriverProvider;
import com.demo.config.driver.AppDriver;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class ActionHelper {
    public WebDriverWait webDriverWait;
    public AppiumDriver appiumDriver;
    private HashMap<String, String> scrollObject = new HashMap<>();


    public ActionHelper(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public boolean checkPresenceOfElement(By locator) {
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

    public void scrollForAndroid(By WebLocator) {
        boolean canScrollMore = true;
        canScrollMore = (Boolean) AppiumDriverProvider.sessionDriver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "elementId", ((RemoteWebElement) findElement(WebLocator)).getId(),
                        "direction", "down",
                        "percent", 0.75
                )
        );
        System.out.println(canScrollMore);
    }

    public void scrollForiOS(IOSElement el){

        scrollObject.put("direction", "down");
        scrollObject.put("element", el.getId());
        AppiumDriverProvider.sessionDriver.executeScript("mobile: swipe", scrollObject);
    }
}
