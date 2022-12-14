package co.com.choucair.certification.RetoAutomatizacion_StarSharp.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/UserStarSharp.feature",
        tags= "@scenario2",
        glue="co.com.choucair.certification.RetoAutomatizacion_StarSharp.stepdefinitions",

        snippets=CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}