package com.demo.screens.common;

import com.demo.config.driver.AppDriver;
import com.demo.contracts.Home;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen implements Home {
    ActionHelper actionHelper;
    protected By sortButtonLocator;
    protected By menuButton;
    protected By productLocator;

    public HomeScreen() {
        actionHelper = new ActionHelper(appiumDriver);
        if (AppDriver.getDriver() instanceof AndroidDriver) {
            sortButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc='sort button']");
            menuButton = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
            productLocator = By.xpath("(//android.widget.TextView[contains(@text,'Sauce Labs Backpack')])[1]");
        } else if (AppDriver.getDriver() instanceof IOSDriver) {
            sortButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc='sort button']");
            menuButton = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
            productLocator = By.xpath("(//android.widget.TextView[contains(@text,'Sauce Labs B

        }
    }

    @Override
    public boolean isVisible() {
        return actionHelper.checkPresenceOfElement(sortButtonLocator);
    }

    public void clickMenuButton() {
        actionHelper.findElement(menuButton).click();
    }


    public void clickFirstProduct() {
        actionHelper.findElement(productLocator).click();
    }

}
