package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        tags = "",
        glue = "Steps",
        plugin = {"pretty", "html:target/Reports/HtmlLastReport.html",
                "json:target/Reports/JsonLastReport.json"})
public class TestRunner {
}
