package com.demo.screens.Android;

import com.demo.screens.common.CheckOutScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CheckOutAndroidScreen extends CheckOutScreen implements Provider<CheckOutAndroidScreen> {

    @Inject
    public CheckOutAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper){
        super(appiumDriver,actionHelper);
        sortButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc='sort button']");
        menuButton = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
    }

    @Override
    public CheckOutAndroidScreen get() {
        return this;
    }
}
