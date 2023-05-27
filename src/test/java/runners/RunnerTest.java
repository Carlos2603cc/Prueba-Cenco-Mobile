package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Escenarios.feature",
        glue = "src/test/stepdefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
