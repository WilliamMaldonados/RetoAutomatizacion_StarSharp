package co.com.choucair.certification.RetoAutomatizacion_StarSharp.tasks;

import co.com.choucair.certification.RetoAutomatizacion_StarSharp.userinterface.StarSharpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenthePage implements Task {
private StarSharpPage starSharpPage;
    public static OpenthePage thepage(){
        return Tasks.instrumented(OpenthePage.class);
    }


    @Override
   public  < T extends Actor> void performAs( T actor){
        actor.attemptsTo(Open.browserOn(starSharpPage));

    }
}

