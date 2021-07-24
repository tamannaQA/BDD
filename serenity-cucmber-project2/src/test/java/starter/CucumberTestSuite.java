package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/HtmlReports"},
        features = "src/test/resources/features",
        tags="@personalinfo", glue="starter.stepdefinitions"
)
public class CucumberTestSuite {}
