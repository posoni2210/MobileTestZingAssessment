package com.demo.screens;

import com.demo.contracts.VisibleInterface;
import com.demo.utils.Base;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import javax.swing.*;

public abstract class BaseScreen extends Base implements VisibleInterface {
    protected AppiumDriver appiumDriver;
    protected ActionHelper actionHelper;
    protected By uniqueLocator;

    public BaseScreen(AppiumDriver appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver);
        this.actionHelper = actionHelper;
    }

    @Override
    public boolean isVisible() {
        return actionHelper.checkPresenceOfElement(uniqueLocator);
    }
}
