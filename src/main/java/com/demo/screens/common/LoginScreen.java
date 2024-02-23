package com.demo.screens.common;

import com.demo.contracts.Login;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class LoginScreen extends BaseScreen implements Login {
    protected By username;
    protected LoginScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible() {
        return actionHelper.checkPresenceOfElement(username);
    }

    @Override
    public void enterCredentials() {

    }

    @Override
    public void clickLogin() {

    }
}
