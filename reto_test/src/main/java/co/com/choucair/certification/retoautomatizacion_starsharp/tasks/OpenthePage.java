package co.com.choucair.certification.retoautomatizacion_starsharp.tasks;

import co.com.choucair.certification.retoautomatizacion_starsharp.userinterface.StarSharpPage;
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

