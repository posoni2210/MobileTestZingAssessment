package com.demo.screens.common;
import com.demo.contracts.Home;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class HomeScreen extends BaseScreen implements Home {
    protected By sortButtonLocator;
    protected By menuButton;
    protected By productLocator;
    protected HomeScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(sortButtonLocator);
    }
    @Override
    public void clickMenuButton() {
        appiumDriver.findElement(menuButton).click();
    }

    @Override
    public void clickFirstProduct() {
        appiumDriver.findElement(productLocator).click();
    }

}
