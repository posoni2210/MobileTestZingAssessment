
import com.demo.config.AppiumDriverProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty:target/cucumber/cucumber.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber/cucumber.json",
                "com.demo.utils.TestStepListner"
        },
        features = {"src/test/resources/Features"},
        glue = {"StepDefs", "com.demo.utils"}
        , tags = "@test"
)
public class Runner {

    @BeforeClass
    public static void setup() {
        AppiumDriverProvider.initiateApp();
    }

    @After
    public void tearDown() {
        AppiumDriverProvider.tearDown();
    }
}
