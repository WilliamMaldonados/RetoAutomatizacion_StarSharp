package co.com.choucair.certification.RetoAitomatizacion_StarSharp.tasks;

import co.com.choucair.certification.RetoAitomatizacion_StarSharp.userinterface.StarSharpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
private StarSharpPage starSharpPage;
    public static Openup thepage(){
        return Tasks.instrumented(Openup.class);
    }


    @Override
   public  < T extends Actor> void performAs( T actor){
        actor.attemptsTo(Open.browserOn(starSharpPage));

    }
}

