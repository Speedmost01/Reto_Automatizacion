package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosRegisterUtestPage extends PageObject {
    public static final Target FirstName = Target.the("Campo para Ingresar el Nombre del usuario").located(By.id("firstName"));
    public static final Target LastName = Target.the("Campo para Ingresar el Apellido del usuario").located(By.id("lastName"));
    public static final Target Email = Target.the("Campo para Ingresar el Email del usuario").located(By.id("email"));
    public static final Target Month = Target.the("Campo para Ingresar el Mes de nacimiento del usuario").located(By.id("birthMonth"));
    public static final Target Day = Target.the("Campo para Ingresar el Dia de nacimiento del usuario").located(By.id("birthDay"));
    public static final Target Year = Target.the("Campo para Ingresar el Año de nacimiento del usuario").located(By.id("birthYear"));
    public static final Target Lenguages = Target.the("Campo para Ingresar Idiomas del usuario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target ButtonNext = Target.the("Boton para pasar a la siguiente pagina del formulario").located(By.xpath("//a[@class='btn btn-blue']"));
}
