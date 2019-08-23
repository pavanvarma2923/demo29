package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="",glue="skeleton",tags= {"@Sanity"},plugin= {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
