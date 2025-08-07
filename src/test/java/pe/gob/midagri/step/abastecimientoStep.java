package pe.gob.midagri.step;

import org.openqa.selenium.Keys;
import pe.gob.midagri.page.abasteciminetoPage;
import pe.gob.midagri.util.Tools;

public class abastecimientoStep {

    abasteciminetoPage page = new abasteciminetoPage();

    public void abrirPaginaSisap() {
        page.abrirPaginaSisap();
    }

    public void clickBotonIngresar() {
        page.clickBotonIngresar();
    }

    public void clickCheckboxRegion() {
        page.clickCheboxRegion();
    }

    public void clickOpcionTiempo(String opcion) {
        page.clickOpcionTiempo(opcion);
    }

    public void ingresarFechas(String fechaInicio, String fechaFinal) {
        page.ingresarFechas(fechaInicio, fechaFinal);
    }

    public void selecionarMercado(String mercado) {
        page.selecionarMercado(mercado);
    }

    public void deselecionarTodosProductos() {
        page.deselecionarTodosProductos();
    }

    public void selecionarProducto(String producto) {
        page.seleccionarProducto(producto);
    }

    public void deselecionarTodasVariedad() {
        page.deselecionarTodasVariedad();
    }

    public void seleccionarVariedad(String opcion) {
        page.seleccionarVariedad(opcion);
    }

    public void clickCheckBoxProcedenciaRegiones() {
        page.clickCheckBoxProcedenciaRegiones();
    }

    public void seleccionarProcedencia(String abastecimiento) {
        page.seleccionarProcedencia(abastecimiento);
    }

    public void clickBotonBuscar() {
        page.clickBuscar();
    }
}
