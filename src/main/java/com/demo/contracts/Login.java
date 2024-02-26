package com.demo.contracts;

public interface Login extends VisibleInterface {
    void enterCredentials() throws InterruptedException;
    void clickLogin();

}
