package com.demo.config;

import com.demo.config.driver.MobileAndroidDriver;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.typesafe.config.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.NotImplementedException;

public class AppiumDriverProvider implements Provider<AppiumDriver<MobileElement>> {
    private final Boolean isAndroid = System.getProperty("platform").equalsIgnoreCase("android");
    private static AppiumDriver<MobileElement> sessionDriver;
    private Config config;

    @Inject
    public AppiumDriverProvider(Config config){
        this.config = config;

    }

    @Override
    public synchronized AppiumDriver<MobileElement> get() {
        if (isAndroid) {
            sessionDriver = new MobileAndroidDriver(config).buildAndroidDriver();
            try {
                sessionDriver.wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new NotImplementedException("iOS not implemented");
        }
        return sessionDriver;
    }
}
