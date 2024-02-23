package StepDefs;

import com.demo.contracts.Home;
import com.demo.contracts.MyCart;
import io.cucumber.java8.En;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class MyCartStep implements En {

    @Inject
    public MyCartStep(MyCart myCart) {
        Given("the user is on the My cart page", () -> {
            String reason = "My Cart page is not visible";
            boolean actual = true;
            boolean expected = myCart.isVisible();
            assertThat(reason,actual,equalTo(expected));
        });

        When("the user click ProceedToCheckout on the My cart page", () -> {
            myCart.clickProceedToCheckout();
        });


    }


}
