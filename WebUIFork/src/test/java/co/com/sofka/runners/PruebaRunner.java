package co.com.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
glue = "co.com.sofka.stepsdefinitions.prueba",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class PruebaRunner {
}
