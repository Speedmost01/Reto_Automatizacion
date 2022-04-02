package co.com.reto.automatizacion.stepdefinitions;

import co.com.reto.automatizacion.questions.AnswerUtest;
import co.com.reto.automatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class retoautomatizacionStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Yair busca registrarse en Utest para acceder a sus beneficios$")
    public void yairBuscaRegistrarseEnUtestParaAccederASusBeneficios() {
        OnStage.theActorCalled("Yair").wasAbleTo(OpenUp.thePage(),
                (Register.OnThePage()));

    }

    @When("^Ingrese los datos solicitados por el formulario$")
    public void ingreseLosDatosSolicitadosPorElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.OnThePage(),
                (IngresarDatosUbicacion.OnThePage()),
                (IngresarDatosSO.OnThePage()),
                (CrearClave.OnThePage()));
    }

    @Then("^Yair se registra en Utest correctamente$")
    public void yairSeRegistraEnUtestCorrectamente() {
        String question="Complete Setup";
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerUtest.ToThe(question)));
    }
}
