package co.com.sofka.userinterface.landingpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {
    public static final Target LAUNCH =
            Target.the("Destination List").located(By.xpath("//input[@value='Launch']"));

    public static final Target DESTINATION_LIST =
            Target.the("List").located(By.xpath("(//li[@class='theme__selected___2Uc3r'])[1]"));

    public static final Target SHENJI_DESTINY =
            Target.the("Babahoyo Destiny").located(By.xpath("//ul[@class='theme__values___1jS4g']//child::li[@class][contains(string(), 'Shenji')]"));

    public static final Target BOOK =
            Target.the("Book").located(By.xpath("//button[@type='button'][contains(string(), 'Book')]"));

    public static final Target PROMO_CODE =
            Target.the("Promo code").located(By.xpath("//input[@name='promo']"));

    public static final Target APPLY_PROMO_CODE =
            Target.the("Apply promo code").located(By.xpath("//div[@class='flexboxgrid__col-xs-5___1HkK5']//button[@type='button']"));

    public static final Target TOTAL_PRICE =
            Target.the("Total Price").located(By.xpath("//div[@class='flexboxgrid__col-xs-5___1HkK5'][contains(string(),'$')]"));

    public static final Target TOTAL_PRICE_WITH_DISCOUNT =
            Target.the("Total Price").located(By.xpath("//strong[@class='OrderSummary__headline-1___1lzsL']"));


}
