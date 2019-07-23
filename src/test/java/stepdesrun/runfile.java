package stepdesrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/casestudy2/casestudy.feature",plugin="json:target\\jsonReport.json")
public class runfile {

}
