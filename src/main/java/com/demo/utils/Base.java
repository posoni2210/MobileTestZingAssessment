package com.demo.utils;

import io.appium.java_client.AppiumDriver;

import static org.openqa.selenium.support.PageFactory.*;

public class Base {
    public Base(AppiumDriver appiumDriver){
        initElements(appiumDriver,this);
    }
}
