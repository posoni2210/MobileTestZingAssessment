package StepDefs;

import com.demo.contracts.Home;
import com.demo.contracts.Menu;
import io.cucumber.java8.En;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class MenuStep implements En {

    @Inject
    public MenuStep(Menu menu) {
        Given("the user is on the Menu page", () -> {
            String reason = "Menu page is not visible";
            boolean actual = true;
            boolean expected = menu.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user clicks Login on the Menu screen", () -> {
            menu.clickLogin();
        });

    }


}
