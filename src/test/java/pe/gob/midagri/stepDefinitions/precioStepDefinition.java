package pe.gob.midagri.stepDefinitions;

import io.cucumber.java.es.Y;
import pe.gob.midagri.step.abastecimientoStep;
import pe.gob.midagri.step.precioStep;

public class precioStepDefinition {

    precioStep step = new precioStep();
    @Y("ingreso SISAP Precio")
    public void ingresoSISAPPrecio() {
        step.clickBotonIngresar();

    }

    @Y("damos click al check de Todas las ciudades")
    public void quitamosElCheckDeTodasLasCiudades() {
        step.clickCheckboxRegion();
    }

    @Y("selecionamos la ciudad {string}")
    public void selecionamosLaCiudad(String ciudad) {
        step.selecionarCiudad(ciudad);
    }

    @Y("selecionamos Tipo Mercado {string}")
    public void clickOpcionMercado(String tipoMercado) {
        step.selecionarMercado(tipoMercado);
    }
}
