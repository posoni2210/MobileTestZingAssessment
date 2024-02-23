package StepDefs;

import com.demo.contracts.Home;
import com.demo.contracts.Product;
import com.demo.screens.common.ProductScreen;
import io.cucumber.java8.En;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class ProductStep implements En {

    @Inject
    public ProductStep(Product product) {
        Given("the user is on the Product page", () -> {
            String reason = "Product page is not visible";
            boolean actual = true;
            boolean expected = product.isVisible();
            assertThat(reason,true,equalTo(expected));
        });

        When("the user click AddToCart on Product page", () -> {
            product.clickAddToCart();
        });

        When("the user click cart icon on Product page", () -> {
            product.clickCartIcon();
        });

    }

}
