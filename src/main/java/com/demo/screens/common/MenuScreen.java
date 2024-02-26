package com.demo.screens.common;
import com.demo.config.driver.AppDriver;
import com.demo.contracts.Home;
import com.demo.contracts.Menu;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;

public  class MenuScreen extends BaseScreen implements Menu {
    protected By menuLocator;

    public MenuScreen() {
        if(AppDriver.getDriver() instanceof AndroidDriver){

        }else if(AppDriver.getDriver() instanceof IOSDriver){

        }

    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(menuLocator);
    }

    @Override
    public void clickLogin() {

    }

}
