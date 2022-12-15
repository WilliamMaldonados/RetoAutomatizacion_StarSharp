package co.com.choucair.certification.retoautomatizacion_starsharp.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/UserStarSharp.feature",
        tags= "@stories",
        glue="co.com.choucair.certification.retoautomatizacion_starsharp.stepdefinitions",

        snippets=CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}