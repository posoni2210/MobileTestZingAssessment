package com.demo.config;

import com.demo.config.driver.AppDriver;
import com.demo.config.driver.MobileAndroidDriver;
import com.demo.config.driver.MobileIosDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.NotImplementedException;

public class AppiumDriverProvider{
    private static final Boolean isAndroid = System.getenv("platform").equalsIgnoreCase("android");
    public static AppiumDriver<MobileElement> sessionDriver;

    public AppiumDriverProvider(){

    }
    public static void initiateApp() {
        if (isAndroid) {
            sessionDriver = new MobileAndroidDriver().buildAndroidDriver();

        } else {
            sessionDriver = new MobileIosDriver().buildIosDriver();
        }
        AppDriver.setDriver(sessionDriver);
    }

    public static void tearDown(){
        sessionDriver.quit();
    }

}
