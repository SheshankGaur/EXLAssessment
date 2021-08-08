package cucmberTestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.runtime.model.CucumberExamples;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/cucumberFeatures/GoogleNavigation.feature",
		glue={"cucumberStepDefinitions"})
public class GoogleNavigationTestRunner {

}
