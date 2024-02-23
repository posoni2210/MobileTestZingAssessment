package com.demo.utils;

import com.demo.config.AppiumDriverProvider;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.appium.java_client.AppiumDriver;

public class MyFramework extends AbstractModule {

    @Override
    public void configure(){
        bind(AppiumDriver.class).toProvider(AppiumDriverProvider.class);
    }

    @Provides
    public Config configProvider() {
        Config defaultConfig = ConfigFactory.parseResources("application.conf");
//        String appConfigFile = "C:\\Users\\posoni\\Downloads\\abc\\src\\test\\resources\\Data\\uat_credentials.conf";
//        Config appConfig = ConfigFactory.parseResources(appConfigFile);
        return ConfigFactory.systemEnvironment().withFallback(defaultConfig);
    }
}
