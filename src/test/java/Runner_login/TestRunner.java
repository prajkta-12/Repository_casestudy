package Runner_login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature_file",glue= {"StepDefination"},tags= ("@login"))
public class TestRunner {

}
