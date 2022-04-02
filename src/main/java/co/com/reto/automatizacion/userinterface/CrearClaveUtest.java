package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CrearClaveUtest extends PageObject {
    public static final Target Pasword = Target.the("Crear clave del usuario").located(By.id("password"));
    public static final Target ConfirmPassword = Target.the("Confirmar clave del usuario").located(By.id("confirmPassword"));
    public static final Target Terms = Target.the("Aceptar terminos de uso de Utest").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target Privacity = Target.the("Aceptar terminos de privacidad de Utest").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BottonFinish = Target.the("Boton para terminar el proceso de registro").located(By.id("laddaBtn"));
    public static final Target TextBottonFinish = Target.the("Texto del boton para terminar el proceso de registro").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a/span[1]/span"));
}
