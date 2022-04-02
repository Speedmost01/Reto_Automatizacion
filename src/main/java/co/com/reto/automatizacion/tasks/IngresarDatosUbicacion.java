package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.DatosRegisterAddressUser;
import co.com.reto.automatizacion.userinterface.DatosRegisterUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class IngresarDatosUbicacion implements Task {
    public static IngresarDatosUbicacion OnThePage() {
        return Tasks.instrumented(IngresarDatosUbicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Cali").into(DatosRegisterAddressUser.City),
                Hit.the(Keys.ARROW_DOWN).into(DatosRegisterAddressUser.City),
                Hit.the(Keys.ENTER).into(DatosRegisterAddressUser.City),
                Enter.theValue("111931").into(DatosRegisterAddressUser.Zip),
                Click.on(DatosRegisterAddressUser.CountryClick),
                //SelectFromOptions.byVisibleText("Colombia").from(DatosRegisterAddressUser.Country),
                Enter.theValue("Colombia").into(DatosRegisterAddressUser.Country),
                //Click.on(DatosRegisterAddressUser.Country),
                Hit.the(Keys.ARROW_DOWN).into(DatosRegisterAddressUser.Country),
                Hit.the(Keys.ENTER).into(DatosRegisterAddressUser.Country),
                Click.on(DatosRegisterAddressUser.BottonNext));
    }
}
