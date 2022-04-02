package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.CrearClaveUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearClave implements Task {

    public static CrearClave OnThePage() {
        return Tasks.instrumented(CrearClave.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Speedmost03").into(CrearClaveUtest.Pasword),
                Enter.theValue("Speedmost03").into(CrearClaveUtest.ConfirmPassword),
                Click.on(CrearClaveUtest.Terms),
                Click.on(CrearClaveUtest.Privacity),
                Click.on(CrearClaveUtest.BottonFinish));

    }
}
