package co.com.sofka.question;

import co.com.sofka.userinterface.landingpage.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PriceWithDisscount implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckOutPage.TOTAL_PRICE_WITH_DISCOUNT).viewedBy(actor).asString();
    }

    public static PriceWithDisscount priceWithDisscount() {
        return new PriceWithDisscount();
    }
}
