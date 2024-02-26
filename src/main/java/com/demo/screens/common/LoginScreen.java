package com.demo.screens.common;

import com.demo.config.driver.AppDriver;
import com.demo.contracts.Login;
import com.demo.screens.BaseScreen;
import com.demo.utils.helpers.ActionHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;

public class LoginScreen extends BaseScreen implements Login {
    protected By username;
    protected By password;
    protected By LoginBtn;
    protected ActionHelper actionHelper;
    public LoginScreen() {
        actionHelper = new ActionHelper(appiumDriver);
        if(AppDriver.getDriver() instanceof AndroidDriver){
            username = By.xpath("//android.widget.EditText[@content-desc='Username input field']");
            password = By.xpath("//android.widget.EditText[@content-desc='Password input field']");
            LoginBtn = By.xpath("//android.view.ViewGroup[@content-desc='Login button']");
        }else if(AppDriver.getDriver() instanceof IOSDriver){

        }
    }

    @Override
    public boolean isVisible() {
        return actionHelper.checkPresenceOfElement(username);
    }

    @Override
    public void enterCredentials() {
    actionHelper.findElement(username).sendKeys("bob@example.com");
    actionHelper.findElement(password).sendKeys("10203040");
    }

    @Override
    public void clickLogin() {
        actionHelper.findElement(LoginBtn).click();

    }
}
