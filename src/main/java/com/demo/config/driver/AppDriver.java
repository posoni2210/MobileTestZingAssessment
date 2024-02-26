package com.demo.config.driver;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AppDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private static AppDriver instance = null;

    private AppDriver() {
    }

    public static AppDriver getInstance(){
        if (instance==null){
            instance = new AppDriver();
        }
        return instance;
    }
    public WebDriver get(){
        return driver.get();
    }

    public static WebDriver getDriver(){
        return getInstance().get();
    }
    public static void setDriver(WebDriver webDriver){
        driver.set(webDriver);
    }

}
