package co.com.sofka.stepsdefinitions.prueba;

import co.com.sofka.setup.Setup;
import co.com.sofka.task.landingpage.PruebaTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class pruebaestep extends Setup {
    private final String actorName = "Bartolo";

    @Given("pagina principal")
    public void paginaPrincipal() {
        actorSetupTheBrowser(actorName);
    }

    @When("le da barrita {string}")
    public void leDaBarrita(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(PruebaTask.pruebaTask().usingPrice(string));
    }

    @Then("aja y aja")
    public void ajaYAja() {

    }


}
