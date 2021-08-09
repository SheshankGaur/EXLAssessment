package cucmberTestRunner;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/cucumberFeatures/GoogleNavigation.feature",
		glue="cucumberStepDefinitions")
public class GoogleNavigationTestRunner {

}
