package com.demo.screens.Android;

import com.demo.screens.common.HomeScreen;
import com.demo.screens.common.MenuScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MenuAndroidScreen extends MenuScreen implements Provider<MenuAndroidScreen> {

    @Inject
    public MenuAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper){
        super(appiumDriver,actionHelper);
    }

    @Override
    public MenuAndroidScreen get() {
        return this;
    }
}
