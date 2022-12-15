package co.com.choucair.certification.retoautomatizacion_starsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static co.com.choucair.certification.retoautomatizacion_starsharp.userinterface.DasboardMenuPage.*;
import static co.com.choucair.certification.retoautomatizacion_starsharp.userinterface.MeetingPage.*;

public class CreateMeeting implements Task {

    private Map<String, String> data;

    public CreateMeeting (Map<String, String>data) {this.data = data;}

    public static CreateMeeting create (Map<String, String> data){return Tasks.instrumented(CreateMeeting.class,data);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEW_MEETING_BUTTON),
                Enter.theValue(data.get("meetName")).into(NAME_INPUT_MEETING),
                Click.on(TYPE_SELECT),
                Click.on(TYPE_WEEKLY),
                Enter.theValue(data.get("meetNumber")).into(NUMBER_INPUT),
                Enter.theValue(data.get("meetDateStart")).into(DATE_START_INPUT),
                SelectFromOptions.byVisibleText("12:50").from(TIME_START_SELECT),
                Enter.theValue(data.get("meetDateEnd")).into(DATE_END_INPUT),
                SelectFromOptions.byVisibleText("13:50").from(TIME_END_SELECT),
                Click.on(LOCATION_SELECT),
                Click.on(LOCATION_SD),
                Click.on(UNIT_SELECT),
                Enter.theValue(data.get("unitName ")).into(UNIT_INPUT),
                Click.on(UNIT_PRUEBA),
                Click.on(ORGANIZED_SELECT),
                Click.on(ORGANIZED),
                Click.on(REPORTER_SELECT),
                Click.on(REPORTER),
                Click.on(CREATE_BUTTON))
        ;

    }
}
