
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty:target/cucumber/cucumber.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber/cucumber.json",
                "com.demo.utils.TestStepListner"
        },
        features = {"src/test/resources/Features"},
        glue = {"StepDefs","com.demo.utils"}
        ,tags = "@test"
)
public class Runner {
}
