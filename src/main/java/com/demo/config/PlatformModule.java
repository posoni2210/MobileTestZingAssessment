package com.demo.config;

import com.google.inject.Module;

public enum PlatformModule {
    IOS {
        public Module getModule() {
            return null ;
        }
    },
    ANDROID {
        public Module getModule() {
            return new MyAndroidModule();
        }
    };

    public abstract Module getModule();
}
