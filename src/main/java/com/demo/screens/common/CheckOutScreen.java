package com.demo.screens.common;
import com.demo.config.driver.AppDriver;
import com.demo.contracts.CheckOut;

import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public  class CheckOutScreen extends BaseScreen implements CheckOut {
    ActionHelper actionHelper;
    protected By toPayment;
    public CheckOutScreen(){
        actionHelper = new ActionHelper(appiumDriver);
        if(AppDriver.getDriver() instanceof AndroidDriver){
            toPayment = By.xpath("//android.view.ViewGroup[@content-desc='To Payment button']");
        }
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(toPayment);
    }
}
