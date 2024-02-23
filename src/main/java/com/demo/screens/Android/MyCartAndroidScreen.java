package com.demo.screens.Android;

import com.demo.screens.common.MyCartScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MyCartAndroidScreen extends MyCartScreen implements Provider<MyCartAndroidScreen> {

    @Inject
    public MyCartAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper){
        super(appiumDriver,actionHelper);
        sortButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc='sort button']");
        menuButton = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
        proceedToCheckout = By.xpath("//android.view.ViewGroup[@content-desc='Proceed To Checkout button']");
    }

    @Override
    public MyCartAndroidScreen get() {
        return this;
    }

}
