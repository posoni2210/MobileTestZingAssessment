package StepDefs;

import com.demo.screens.common.*;
import io.cucumber.java8.En;
import org.junit.Before;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class StepDef implements En {
    HomeScreen homeScreen;
    LoginScreen loginScreen;
    MenuScreen menuScreen;
    MyCartScreen myCartScreen;
    ProductScreen productScreen;
    CheckOutScreen checkOutScreen;

    public void settingClasses(){
        homeScreen = new HomeScreen();
        loginScreen = new LoginScreen();
        menuScreen = new MenuScreen();
        myCartScreen = new MyCartScreen();
        productScreen = new ProductScreen();
        checkOutScreen = new CheckOutScreen();
    }

    public StepDef(){
        Given("the user is on the Home page", () -> {
            settingClasses();
            String reason = "Home page is not visible";
            boolean actual = true;
            boolean expected = homeScreen.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user clicks the Menu button on the home page", () -> {
            homeScreen.clickMenuButton();
        });
        Then("the user select a product on Home page", () -> {
            homeScreen.clickFirstProduct();
        });

        Given("the user is on the Login Page", () -> {
            String reason = "Login page is not visible";
            boolean actual = true;
            boolean expected = loginScreen.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user enters credentials on the Login screen", () -> {
            loginScreen.enterCredentials();
        });
        When("the user clicks Login button on the Login screen", () -> {
            loginScreen.clickLogin();
        });

        Given("the user is on the Menu page", () -> {
            String reason = "Menu page is not visible";
            boolean actual = true;
            boolean expected = menuScreen.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user clicks Login on the Menu screen", () -> {
            menuScreen.clickLogin();
        });

        Given("the user is on the Checkout page", () -> {
            String reason = "Checkout page is not visible";
            boolean actual = true;
            boolean expected = checkOutScreen.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        Given("the user is on the My cart page", () -> {
            String reason = "My Cart page is not visible";
            boolean actual = true;
            boolean expected = myCartScreen.isVisible();
            assertThat(reason,actual,equalTo(expected));
        });

        When("the user click ProceedToCheckout on the My cart page", () -> {
            myCartScreen.clickProceedToCheckout();
        });

        Given("the user is on the Product page", () -> {
            String reason = "Product page is not visible";
            boolean actual = true;
            boolean expected = productScreen.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user click AddToCart on Product page", () -> {
            productScreen.clickAddToCart();
        });

        When("the user click cart icon on Product page", () -> {
            productScreen.clickCartIcon();
        });
    }









}
