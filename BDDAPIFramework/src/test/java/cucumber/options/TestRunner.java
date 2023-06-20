package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\BDDAPIFramework\\src\\test\\java\\Features\\CreateRepo.feature",
plugin= {"json:target/jsonReports/cucumber-report.json"},
glue="stepDefinitions",
dryRun=false,
monochrome=true
)
public class TestRunner {

}
