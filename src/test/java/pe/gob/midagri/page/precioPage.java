package pe.gob.midagri.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pe.gob.midagri.util.DriverManager;
import pe.gob.midagri.util.Tools;

public class precioPage {
    //    Definition de los localizadores
    @FindBy(xpath = "//app-home/div/main/div/div[1]/button")
    public WebElement btnIngresar;

    @FindBy(xpath = "//*[@id=\"RegionCheckbox\"]")
    public WebElement chboxRegion;

    @FindBy(xpath = "//*[@id=\"pn_id_13\"]")
    public WebElement selectorCiudad;


    //    Configuration de PageFactory
    private WebDriver driver;
    private Actions teclado;

    public precioPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        this.teclado = new Actions(this.driver);
    }

    public void clickBotonIngresar() {

        btnIngresar.click();
    }

    public void clickCheboxRegion() {
        chboxRegion.click();
    }

    public void selecionCiudad(String opcion) {
        Tools.selecionarElemento(selectorCiudad, "//*[contains(text(),'" + opcion + "')]");
        teclado.keyDown(Keys.ESCAPE).perform();
    }

    public void selecionarMercado(String opcion) {
        WebElement elemento = driver.findElement(By.xpath("//*[contains(text(),'" + opcion + "')]"));
        elemento.click();
    }

}
