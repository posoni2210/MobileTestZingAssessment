package com.demo.config.driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class MobileIosDriver {

    public MobileIosDriver(){

    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "17.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 15");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/admin/Downloads/MyRNDemoApp.app");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        return capabilities;
    }

    public AppiumDriver<MobileElement> buildIosDriver() {
        try {
            return new IOSDriver<>(new URL("http://0.0.0.0:4723/"),getCapabilities());
        } catch (Exception exception) {
            throw new RuntimeException("Failed to build Ios Driver",exception);
        }

    }


}
