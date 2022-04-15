package co.com.sofka.question;

import co.com.sofka.userinterface.landingpage.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TotalPrice implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckOutPage.TOTAL_PRICE).viewedBy(actor).asString();
    }

    public static TotalPrice totalPrice() {
        return new TotalPrice();
    }
}
