package com.demo.config;

import com.demo.utils.MyFramework;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import io.cucumber.junit.CucumberOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;

public class MyInjector implements InjectorSource {
    private final Logger log = LoggerFactory.getLogger(MyInjector.class);

    @Override
    public Injector getInjector() {
        System.out.println("Start___");
        String platform = System.getProperty("platform");
        log.info("Platform:{}",platform);
        return Guice.createInjector(Stage.PRODUCTION,PlatformModule.valueOf(platform).getModule(),new MyFramework(), CucumberModules.createScenarioModule());
    }
}
