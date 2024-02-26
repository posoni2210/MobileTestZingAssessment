package com.demo.screens.common;
import com.demo.config.driver.AppDriver;
import com.demo.contracts.Home;
import com.demo.contracts.MyCart;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;

public class MyCartScreen extends BaseScreen implements MyCart {
    protected By sortButtonLocator;
    protected By menuButton;
    protected By proceedToCheckout;
    ActionHelper actionHelper;

    public MyCartScreen() {
        actionHelper = new ActionHelper(appiumDriver);
        if(AppDriver.getDriver() instanceof AndroidDriver)
        {
            proceedToCheckout = By.xpath("//android.view.ViewGroup[@content-desc='Proceed To Checkout button']");
        }
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(proceedToCheckout);
    }
    @Override
    public void clickProceedToCheckout() {
    actionHelper.findElement(proceedToCheckout).click();
    }
}
