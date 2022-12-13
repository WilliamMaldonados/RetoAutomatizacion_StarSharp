package co.com.choucair.certification.RetoAutomatizacion_StarSharp.stepdefinitions;

import co.com.choucair.certification.RetoAitomatizacion_StarSharp.questions.SearchBU;
import co.com.choucair.certification.RetoAitomatizacion_StarSharp.tasks.CreateBU;
import co.com.choucair.certification.RetoAitomatizacion_StarSharp.tasks.Login;
import co.com.choucair.certification.RetoAitomatizacion_StarSharp.tasks.Openup;
import co.com.choucair.certification.RetoAitomatizacion_StarSharp.tasks.ValidationBU;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class UserStepDefinitions {
@Before
public void setStage(){  OnStage.setTheStage (new OnlineCast());}

    @Given("that the user is on the star sharp page")
    public void that_the_user_is_on_the_star_sharp_page() {
    theActorCalled("user").wasAbleTo(Openup.thepage());
    }



    @Given("the user Logs in")
    public void the_user_logs_in(io.cucumber.datatable.DataTable data) {
        List<Map<String,String>> datalogin= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(Login.onThePage(datalogin.get(0).get("user"),datalogin.get(0).get("password")));
            }

    @Given("he go to the Bussines Units")
    public void he_go_to_the_bussines_units() {
        theActorInTheSpotlight().attemptsTo(ValidationBU.toBussines("unit"));

            }

    @When("he create a new unit")
    public void he_create_a_new_unit(io.cucumber.datatable.DataTable data) {
        List <Map<String,String>>dataunit= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(CreateBU.create(dataunit.get(0).get("unitName")));
    }

    @Then("^the (.*) should display in the menu$")
    public void the_UnidadWill_should_display_in_the_menu(String data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchBU.theItemExist(data)));
    }

    }