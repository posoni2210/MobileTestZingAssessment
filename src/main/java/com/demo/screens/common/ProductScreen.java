package com.demo.screens.common;
import com.demo.config.driver.AppDriver;
import com.demo.contracts.Product;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductScreen extends BaseScreen implements Product {
    protected By addToCartLocator;
    protected By cartIconLocator;
    protected By contentHeader;
    ActionHelper actionHelper;
    public ProductScreen() {
        actionHelper = new ActionHelper(appiumDriver);
        if(AppDriver.getDriver() instanceof AndroidDriver){
            addToCartLocator = By.xpath("//android.view.ViewGroup[@content-desc='Add To Cart button']//android.widget.TextView");
            cartIconLocator = By.xpath("//android.view.ViewGroup[@content-desc='cart badge']");
          contentHeader = By.id("action_bar_root");
        } else if (AppDriver.getDriver() instanceof IOSDriver) {
            addToCartLocator = By.xpath("//XCUIElementTypeOther[@name='Add To Cart button']");
            cartIconLocator = By.xpath("//XCUIElementTypeButton[@name='tab bar option cart']");
            contentHeader = By.xpath("//XCUIElementTypeStaticText[@name='Sauce Labs Backpack']");

        }
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(cartIconLocator);
    }

    @Override
    public void clickAddToCart() {
        actionHelper.findElement(contentHeader).click();
        if(AppDriver.getDriver() instanceof IOSDriver){
            IOSElement element = (IOSElement) actionHelper.findElement(contentHeader);
            actionHelper.scrollForiOS(element);
        }else{
            actionHelper.scrollForAndroid(contentHeader);
        }
        actionHelper.findElement(addToCartLocator).click();

    }
    @Override
    public void clickCartIcon() {
        actionHelper.findElement(cartIconLocator).click();
    }

}
