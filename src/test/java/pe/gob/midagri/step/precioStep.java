package pe.gob.midagri.step;

import pe.gob.midagri.page.abasteciminetoPage;
import pe.gob.midagri.page.precioPage;

public class precioStep {

    precioPage page = new precioPage();

    public void clickBotonIngresar() {
        page.clickBotonIngresar();
    }

    public void clickCheckboxRegion() {
        page.clickCheboxRegion();
    }

    public void selecionarCiudad(String ciudad) {
        page.selecionCiudad(ciudad);
    }

    public void selecionarMercado(String tipoMercado) {
        page.selecionarMercado(tipoMercado);
    }
}
