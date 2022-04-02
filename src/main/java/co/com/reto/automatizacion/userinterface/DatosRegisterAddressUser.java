package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosRegisterAddressUser extends PageObject {
    public static final Target City = Target.the("Campo para Ingresar la ciudad del usuario").located(By.id("city"));
    public static final Target Zip = Target.the("Campo para Ingresar el codigo postal del usuario").located(By.id("zip"));
    public static final Target CountryClick = Target.the("Campo para dar click al objeto country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target Country = Target.the("Campo para ingresar el pais del usuario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target Country2 = Target.the("Campo para ingresar el pais del usuario").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul"));
    public static final Target BottonNext = Target.the("Boton para pasar a la siguiente etapa del formulario").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
