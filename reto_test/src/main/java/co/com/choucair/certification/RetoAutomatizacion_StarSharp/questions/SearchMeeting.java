package co.com.choucair.certification.RetoAutomatizacion_StarSharp.questions;

import co.com.choucair.certification.RetoAutomatizacion_StarSharp.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchMeeting implements Question<Boolean> {

    private String item;

    public SearchMeeting(String item){this.item=item;}

    public static SearchMeeting theItemExist(String item){ return new SearchMeeting(item);}

    @Override
    public Boolean answeredBy(Actor actor) {
        String Item2= actor.asksFor(Text.of(MeetingPage.TABLE_MEET_CREATED));
        return Item2.equals(item);
    }
}
