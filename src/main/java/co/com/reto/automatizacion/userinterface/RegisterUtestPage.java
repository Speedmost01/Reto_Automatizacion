package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterUtestPage extends PageObject {
    public static final Target Register_Button = Target.the("Boton que nos lleva al formulario de registro").located(By.className("unauthenticated-nav-bar__sign-up"));
}
