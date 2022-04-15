package co.com.sofka.userinterface.landingpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PruebaPage extends PageObject {
    public static final Target CAMPO_VALUE =
            Target.the("Esto").located(By.xpath("(//input[@class='theme__inputElement___27dyY theme__filled___1UI7Z'])[2]"));


}
