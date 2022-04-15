package co.com.sofka.task.landingpage;

import co.com.sofka.userinterface.landingpage.PruebaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class PruebaTask implements Task {
    private String valor;

    public PruebaTask usingPrice(String valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                DoubleClick.on(PruebaPage.CAMPO_VALUE),
                SendKeys.of(valor).into(PruebaPage.CAMPO_VALUE),
                Hit.the(Keys.ENTER).into(PruebaPage.CAMPO_VALUE)


        );
    }

    public static PruebaTask pruebaTask() {
        return new PruebaTask();
    }
}
