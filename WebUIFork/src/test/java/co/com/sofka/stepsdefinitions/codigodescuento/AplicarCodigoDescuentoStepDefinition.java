package co.com.sofka.stepsdefinitions.codigodescuento;

import co.com.sofka.setup.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.question.PriceWithDisscount.*;
import static co.com.sofka.question.TotalPrice.totalPrice;
import static co.com.sofka.task.landingpage.QuoteTrip.quoteTrip;
import static co.com.sofka.util.Dictionary.USER_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class AplicarCodigoDescuentoStepDefinition extends Setup {
    @Dado("que el usuario se encuentra en la pagina principal del aplicativo")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDelAplicativo() {
        actorSetupTheBrowser(USER_NAME);
    }

    @Cuando("cotiza su viaje a {string} y aplica el codigo {string}")
    public void cotizaSuViajeAYAplicaElCodigo(String destino, String codigoDePromocion) {
        theActorInTheSpotlight().attemptsTo(quoteTrip().toDestination(destino).withPromoCode(codigoDePromocion));
    }

    @Entonces("debera ver que el precio del viaje sin descuento es de {string}")
    public void deberaVerQueElPrecioDelViajeSinDescuentoEsDe(String precioSinDescuentoEsperado) {
        theActorInTheSpotlight().should(seeThat(totalPrice(), containsString(precioSinDescuentoEsperado)));
    }

    @Entonces("el precio con descuento sera de {string}")
    public void elPrecioConDescuentoSeraDe(String precioConDescuentoEsperado) {
        theActorInTheSpotlight().should(seeThat(priceWithDisscount(), containsString(precioConDescuentoEsperado)));
    }

}
