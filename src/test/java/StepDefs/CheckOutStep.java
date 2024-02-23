package StepDefs;

import com.demo.contracts.CheckOut;
import com.demo.contracts.Home;
import io.cucumber.java8.En;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class CheckOutStep implements En {

    @Inject
    public CheckOutStep(CheckOut checkOut) {
        Given("the user is on the Checkout page", () -> {
            String reason = "Checkout page is not visible";
            boolean actual = true;
            boolean expected = checkOut.isVisible();
            assertThat(reason,true,equalTo(expected));
        });


    }


}
