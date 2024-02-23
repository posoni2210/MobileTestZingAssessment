package com.demo.screens.common;
import com.demo.contracts.CheckOut;
import com.demo.contracts.Home;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class CheckOutScreen extends BaseScreen implements CheckOut {
    protected By sortButtonLocator;
    protected By menuButton;

    protected CheckOutScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(sortButtonLocator);
    }

}
