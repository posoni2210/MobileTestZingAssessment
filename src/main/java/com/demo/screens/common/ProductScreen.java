package com.demo.screens.common;
import com.demo.contracts.Home;
import com.demo.contracts.Product;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class ProductScreen extends BaseScreen implements Product {
    protected By addToCartLocator;
    protected By cartIconLocator;
    protected ProductScreen(AppiumDriver<MobileElement> appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(addToCartLocator);
    }

    @Override
    public void clickAddToCart() {
        actionHelper.scrollGesture(appiumDriver);
        appiumDriver.findElement(addToCartLocator).click();

    }
    @Override
    public void clickCartIcon() {
        appiumDriver.findElement(cartIconLocator).click();
    }

}
