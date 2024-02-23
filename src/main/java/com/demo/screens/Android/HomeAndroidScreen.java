package com.demo.screens.Android;

import com.demo.screens.common.HomeScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeAndroidScreen extends HomeScreen implements Provider<HomeAndroidScreen> {

    @Inject
    public HomeAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper){
        super(appiumDriver,actionHelper);
        sortButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc='sort button']");
        menuButton = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
        productLocator = By.xpath("(//android.widget.TextView[contains(@text,'Sauce Labs Backpack')])[1]");
    }

    @Override
    public HomeAndroidScreen get() {
        return this;
    }
}
