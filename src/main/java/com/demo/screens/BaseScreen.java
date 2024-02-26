package com.demo.screens;

import com.demo.config.driver.AppDriver;
import com.demo.contracts.Login;
import com.demo.contracts.VisibleInterface;
import com.demo.screens.common.*;
import com.demo.utils.Base;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class BaseScreen extends Base implements VisibleInterface {
    protected AppiumDriver appiumDriver;
    protected ActionHelper actionHelper;
    protected By uniqueLocator;

    public BaseScreen() {
        super();
    }

    @Override
    public boolean isVisible() {
        return actionHelper.checkPresenceOfElement(uniqueLocator);
    }

}

