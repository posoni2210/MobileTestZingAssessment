package com.demo.screens.common;
import com.demo.config.AppiumDriverProvider;
import com.demo.config.driver.AppDriver;
import com.demo.contracts.Home;
import com.demo.contracts.Product;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
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
//            contentHeader = By.xpath("//android.widget.ScrollView[@content-desc='product screen']");
        contentHeader = By.id("action_bar_root");
        }
    }

    @Override
    public boolean isVisible(){
        return actionHelper.checkPresenceOfElement(cartIconLocator);
    }

    @Override
    public void clickAddToCart() {
        actionHelper.findElement(contentHeader).click();
        actionHelper.scrollGesture(contentHeader);
        actionHelper.findElement(addToCartLocator).click();

    }
    @Override
    public void clickCartIcon() {
        actionHelper.findElement(cartIconLocator).click();
    }

}
