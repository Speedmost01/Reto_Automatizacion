package co.com.reto.automatizacion.questions;

import co.com.reto.automatizacion.userinterface.CrearClaveUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerUtest implements Question<Boolean> {
    private String question;

    public AnswerUtest(String question){
        this.question ="Complete Setup";
    }

    public static AnswerUtest ToThe(String question) {
        return new AnswerUtest(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameFinal= Text.of(CrearClaveUtest.BottonFinish).viewedBy(actor).asString();
        if (nameFinal.equals("Complete Setup")){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
