package StepDefs;

import com.demo.contracts.Login;
import io.cucumber.java8.En;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginStep implements En {

    @Inject
    public LoginStep(Login login) {
        Given("the user is on the Login Page", () -> {
            String reason = "Login page is not visible";
            boolean actual = true;
            boolean expected = login.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user enters credentials on the Login screen", () -> {
            login.enterCredentials();
        });
        When("the user clicks Login button on the Login screen", () -> {
            login.clickLogin();
        });


    }


}
