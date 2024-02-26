package com.demo.config.driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class MobileAndroidDriver {

    public MobileAndroidDriver(){

    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\posoni\\Downloads\\MobileTestAutomation\\src\\main\\resources\\apps\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        capabilities.setCapability("appActivity",".MainActivity");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        return capabilities;
    }

    public AppiumDriver<MobileElement> buildAndroidDriver() {
        try {
            return new AndroidDriver<>(new URL("http://0.0.0.0:4723/"),getCapabilities());
        } catch (Exception exception) {
            throw new RuntimeException("Failed to build Android Driver",exception);
        }

    }


}
