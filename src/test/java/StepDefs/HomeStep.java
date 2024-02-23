package StepDefs;

import com.demo.contracts.Home;
import io.cucumber.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import javax.inject.Inject;


public class HomeStep implements En {

    @Inject
    public HomeStep(Home home) {
        Given("the user is on the Home page", () -> {
            String reason = "Home page is not visible";
            boolean actual = true;
            boolean expected = home.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user clicks the Menu button on the home page", () -> {
            home.clickMenuButton();
        });
        Then("the user select a product on Home page", () -> {
            home.clickFirstProduct();
        });


    }


}
