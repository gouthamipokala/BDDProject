package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C:\\Users\\gouthami.pokala\\git\\repository\\GmailCucumber\\src\\test\\resources\\Features\\DatatableExa.feature"
		,glue={"stepDefinations"},monochrome = true,strict = true,dryRun = false)

public class TestRunner {

}
