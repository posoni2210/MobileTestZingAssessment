package com.demo.screens.Android;

import com.demo.screens.common.HomeScreen;
import com.demo.screens.common.ProductScreen;
import com.demo.utils.helpers.ActionHelper;
import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ProductAndroidScreen extends ProductScreen implements Provider<ProductAndroidScreen> {

    @Inject
    public ProductAndroidScreen(AppiumDriver appiumDriver, ActionHelper actionHelper) {
        super(appiumDriver, actionHelper);
        addToCartLocator = By.xpath("//android.view.ViewGroup[@content-desc='Add To Cart button']//android.widget.TextView");
        cartIconLocator = By.xpath("//android.view.ViewGroup[@content-desc='cart badge']");
    }

    @Override
    public ProductAndroidScreen get() {
        return this;
    }

}
