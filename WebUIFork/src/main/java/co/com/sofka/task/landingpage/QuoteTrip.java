package co.com.sofka.task.landingpage;

import co.com.sofka.userinterface.landingpage.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.sofka.util.Destinations.SHENJI;

public class QuoteTrip implements Task {
    private String destination;
    private String promoCode;

    public QuoteTrip toDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public QuoteTrip withPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CheckOutPage.DESTINATION_LIST),
                Click.on(CheckOutPage.LAUNCH),
                Check.whether(SHENJI.getValue().equals(destination.trim()))
                        .andIfSo(Click.on(CheckOutPage.SHENJI_DESTINY)),
                Click.on(CheckOutPage.BOOK),
                SendKeys.of(promoCode).into(CheckOutPage.PROMO_CODE),
                Click.on(CheckOutPage.APPLY_PROMO_CODE)
        );
    }

    public static QuoteTrip quoteTrip() {
        return new QuoteTrip();
    }
}
