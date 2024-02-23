package com.demo.screens.common;
import com.demo.contracts.Home;
import com.demo.contracts.MyCart;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class MyCartScreen extends BaseScreen implements MyCart {
    protected By sortButtonLocator;
    protected By menuButton;
    protected By proceedToCheckout;

    protected MyCartScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(sortButtonLocator);
    }
    @Override
    public void clickProceedToCheckout() {

    }
}
