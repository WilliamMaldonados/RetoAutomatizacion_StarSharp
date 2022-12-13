package co.com.choucair.certification.RetoAitomatizacion_StarSharp.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DasboardMenuPage {
    public static final Target BUTTON_LINES = Target.the("item organization in menu").located(By.className("s-sidebar-toggler"));
    public static final Target ORGANIZATION_MENU = Target.the("item organization in menu").located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target UNITS_LINK = Target.the("item unit link").located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target NEW_UNIT_BUTTON= Target.the("new unit button").located(By.cssSelector("div.tool-button.add-button.icon-tool-button"));
    public static final Target NAME_INPUT = Target.the("input name").located(By.name("Name"));
    public static final Target PARENT_SELECT = Target.the("parent select").located(By.xpath("//span[@class='select2-arrow']"));
    public static final Target PARENT_TECH = Target.the("parent tech").located(By.xpath("//div[@id='select2-drop']//ul//li[6]"));
    public static final Target CREATE_BUTTON = Target.the("button create").located(By.cssSelector("div.tool-button.save-and-close-button.icon-tool-button"));
    public static final Target Table_UNIT_CREATED = Target.the("table unit create").located(By.xpath("//a[contains(text(), 'UnidadWill')]"));

}
