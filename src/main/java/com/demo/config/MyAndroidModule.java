package com.demo.config;

public class MyAndroidModule extends AbstractAndroidModule {

    public static String getAutomationName() {
        String platformName = "UiAutomator2";
        return platformName;
    }

    public static String getPlatformName() {
        String platformName = "Android";
        return platformName;
    }

}
