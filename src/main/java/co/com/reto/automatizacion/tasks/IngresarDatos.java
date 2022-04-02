package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.DatosRegisterUtestPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.Keys;

public class IngresarDatos implements Task {
    public static IngresarDatos OnThePage() {
        return Tasks.instrumented(IngresarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Miller").into(DatosRegisterUtestPage.FirstName),
                Enter.theValue("Arias").into(DatosRegisterUtestPage.LastName),
                Enter.theValue("miller555551545155@gmail.com").into(DatosRegisterUtestPage.Email),
                SelectFromOptions.byVisibleText("September").from(DatosRegisterUtestPage.Month),
                SelectFromOptions.byIndex(16).from(DatosRegisterUtestPage.Day),
                SelectFromOptions.byVisibleText("1999").from(DatosRegisterUtestPage.Year),
                Enter.theValue("Spanish").into(DatosRegisterUtestPage.Lenguages),
                Hit.the(Keys.ENTER).into(DatosRegisterUtestPage.Lenguages),
                Click.on(DatosRegisterUtestPage.ButtonNext));
    }
}
