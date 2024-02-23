package com.demo.screens.common;
import com.demo.contracts.Home;
import com.demo.contracts.Menu;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class MenuScreen extends BaseScreen implements Menu {
    protected By menuLocator;

    protected MenuScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(menuLocator);
    }

    @Override
    public void clickLogin() {

    }

}
