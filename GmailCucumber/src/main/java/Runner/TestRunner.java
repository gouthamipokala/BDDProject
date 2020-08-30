package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "D:/Gouthamiworkspace/GmailCucumber/src/test/resources/Features/login.feature"
		,glue={"stepDefinations"})

public class TestRunner {

}
