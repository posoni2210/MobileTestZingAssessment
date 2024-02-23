package com.demo.screens.Android;

import com.demo.screens.common.HomeScreen;
import com.demo.screens.common.LoginScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginAndroidScreen extends LoginScreen implements Provider<LoginAndroidScreen> {

    @Inject
    public LoginAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper){
        super(appiumDriver,actionHelper);
        username = By.xpath("//android.widget.EditText[@content-desc='Username input field']");
    }

    @Override
    public LoginAndroidScreen get() {
        return this;
    }

}
