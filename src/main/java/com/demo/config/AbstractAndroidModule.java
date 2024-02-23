package com.demo.config;

import com.demo.contracts.*;
import com.demo.screens.Android.*;
import com.google.inject.AbstractModule;

public class AbstractAndroidModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Home.class).to(HomeAndroidScreen.class);
        bind(Menu.class).toProvider(MenuAndroidScreen.class);
        bind(Login.class).toProvider(LoginAndroidScreen.class);
        bind(MyCart.class).toProvider(MyCartAndroidScreen.class);
        bind(CheckOut.class).toProvider(CheckOutAndroidScreen.class);
        bind(Product.class).toProvider(ProductAndroidScreen.class);
    }
}
