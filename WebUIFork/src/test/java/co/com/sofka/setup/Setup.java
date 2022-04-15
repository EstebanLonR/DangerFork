package co.com.sofka.setup;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static co.com.sofka.util.Dictionary.WEB_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {
    @Managed()
    protected WebDriver driver;
    private String SO = System.getProperty("os.name").toLowerCase();

    private void setupBrowser() {
        if (SO.contains("nux")) {
            WebDriverManager.chromedriver().linux().setup();
        } else {
            WebDriverManager.chromedriver().win().setup();
        }
        driver = new ChromeDriver();
        driver.get(WEB_URL);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    private void setupUser(String name, WebDriver browser) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetupTheBrowser(String actorName) {
        setupBrowser();
        setupUser(actorName, driver);
    }

}
