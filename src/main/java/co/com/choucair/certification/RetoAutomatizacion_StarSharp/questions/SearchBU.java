package co.com.choucair.certification.RetoAutomatizacion_StarSharp.questions;

import co.com.choucair.certification.RetoAutomatizacion_StarSharp.userinterface.DasboardMenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchBU implements Question<Boolean> {

    private String item;

    public SearchBU (String item){this.item = item;}
    public static SearchBU theItemExist(String item){return new SearchBU(item);}

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(DasboardMenuPage.Table_UNIT_CREATED).answeredBy(actor).equals(item);
    }
}
