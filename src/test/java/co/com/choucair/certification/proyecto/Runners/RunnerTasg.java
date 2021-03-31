package co.com.choucair.certification.proyecto.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/academyChoucair.Feature",
                        tags = "@tag1",
                        glue = "co.com.choucair.certification.proyecto.StepDefinitions",
                        snippets = SnippetType.CAMELCASE)
public class RunnerTasg {
}
