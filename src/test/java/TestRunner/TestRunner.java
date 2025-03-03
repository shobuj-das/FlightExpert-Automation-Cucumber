package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/Features/",
        glue = "StepDefs",
        plugin ={
                "pretty",
                "html:target/cucumber-reports.html"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
