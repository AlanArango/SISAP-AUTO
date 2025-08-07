package pe.gob.midagri.step;

import pe.gob.midagri.page.basePage;

public class baseStep {

    basePage page =new basePage();

    public void clickButton(String nombre){
        page.clickBoton(nombre);
    }
}
