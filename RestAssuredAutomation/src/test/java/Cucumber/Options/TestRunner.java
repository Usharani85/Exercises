package Cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin = { "pretty", "html:target/cucumber-reports" },glue= {"stepDefinitions"},tags = "@addPlace",monochrome = true)
public class TestRunner {
//plugin ="json:target/jsonReports/cucumber-report.json"
}
