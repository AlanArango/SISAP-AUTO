package pe.gob.midagri.stepDefinitions;

import io.cucumber.java.es.Y;
import pe.gob.midagri.step.baseStep;

public class baseStepDefinition {
    baseStep step=new baseStep();

    @Y("damos click a {string}")
    public void damosClickA(String nombreBoton) {
        step.clickButton(nombreBoton);
    }
}
