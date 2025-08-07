package pe.gob.midagri.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import pe.gob.midagri.step.abastecimientoStep;

public class abastecimientoStepDefinition {

    abastecimientoStep step = new abastecimientoStep();

    @Cuando("que me encuentro en la pagina de SISAP")
    public void queMeEncuentroEnLaPaginaDeSISAP() {
         step.abrirPaginaSisap();

    }

    @Y("ingreso SISAP Abastecimiento")
    public void ingresoSISAPAbastecimiento() {
        step.clickBotonIngresar();
    }



    @Y("selecionamos {string}")
    public void selecionamos(String opcion) {
        step.clickOpcionTiempo(opcion);
    }

    @Y("ingresamos {string} y {string}")
    public void ingresamosY(String tiempoInicio, String tiempoFinal) {
        step.ingresarFechas(tiempoInicio,tiempoFinal);
    }

    @Y("selecionamos mercado {string}")
    public void selecionamosMercado(String mercado) {
        step.selecionarMercado(mercado);
    }

    @Y("damos click al check de selecionar todos los Productos")
    public void quitamosElCheckDeSelecionarTodosLosProductos() {
        step.deselecionarTodosProductos();
    }

    @Y("selecionamos el Producto {string}")
    public void selecionamosElProducto(String producto) {
        step.selecionarProducto(producto);
    }

    @Y("damos click al check de selecionar todas las Variedades")
    public void quitamosElCheckDeSelecionarTodasLasVariedades() {
        step.deselecionarTodasVariedad();
    }

    @Y("selecionamos la Variedad {string}")
    public void selecionamosLaVariedad(String variedad) {
        step.seleccionarVariedad(variedad);
    }

    @Y("damos click al check de selecoinar todas las regiones")
    public void damosClickAlCheckDeSelecoinarTodasLasRegiones() {
        step.clickCheckBoxProcedenciaRegiones();
    }

    @Y("selecionamos la Procedencia {string}")
    public void selecionamosLaProcedencia(String abastecimiento) {
        step.seleccionarProcedencia(abastecimiento);
    }

    @Y("damos click al boton Buscar")
    public void damosClickAlBotonBuscar() {
        step.clickBotonBuscar();
    }
}
