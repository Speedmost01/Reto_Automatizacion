package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.DatosRegisterOS;
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

public class IngresarDatosSO implements Task {
    public static IngresarDatosSO OnThePage() {
        return Tasks.instrumented(IngresarDatosSO.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosRegisterOS.OSComputer),
                Enter.theValue("Debian").into(DatosRegisterOS.OSComputer2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.OSComputer2),
                Click.on(DatosRegisterOS.OSVersion),
                Enter.theValue("Debian 11.2").into(DatosRegisterOS.OSVersion2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.OSVersion2),
                Click.on(DatosRegisterOS.OSLenguage),
                Enter.theValue("Spanish").into(DatosRegisterOS.OSLenguage2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.OSLenguage2),

                Click.on(DatosRegisterOS.Movil),
                Enter.theValue("Asus").into(DatosRegisterOS.Movil2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.Movil2),
                Click.on(DatosRegisterOS.Model),
                Enter.theValue("MeMO").into(DatosRegisterOS.Model2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.Model2),
                Click.on(DatosRegisterOS.OSMovil),
                Enter.theValue("Android 3.1").into(DatosRegisterOS.OSMovil2),
                Hit.the(Keys.ENTER).into(DatosRegisterOS.OSMovil2),

                Click.on(DatosRegisterOS.BottonNext));

    }
}
