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

public class abasteciminetoPage {

    //    Definition de los localizadores
    @FindBy(xpath = "//app-home/div/main/div/div[2]/button")
    public WebElement btnIngresar;

    @FindBy(xpath = "//*[@id=\"RegionCheckbox\"]")
    public WebElement chboxRegion;

    @FindBy(xpath = "//*[@id=\"inicio\"]")
    public WebElement inputDateInicio;

    @FindBy(xpath = "(//p-datepicker/span/span)[1]")
    public WebElement pickerDateInicio;

    @FindBy(xpath = "//*[@id=\"final\"]")
    public WebElement inputDateFinal;
    @FindBy(xpath = "(//p-datepicker/span/span)[2]")
    public WebElement pickerDateFinal;

    @FindBy(css = ".p-datepicker-month-selected")
    public WebElement pickerMesSelecionado;
    @FindBy(css = ".p-datepicker-day-selected")
    public WebElement pickerDiaSelecionado;


    @FindBy(xpath = "//*[@id=\"pn_id_13\"]/span")
    public WebElement selectorMercado;

    @FindBy(xpath = "//*[@id=\"ProductoCheckbox\"]")
    public WebElement checkboxProducto;

    @FindBy(xpath = "//*[@inputid=\"ProductoCheckbox\"]/parent::div/following-sibling::p-multiselect")
    public WebElement selectorProducto;

    @FindBy(xpath = "//*[@id=\"VariedadCheckbox\"]")
    public WebElement checkboxVariedad;

    @FindBy(xpath = "//*[@inputid=\"VariedadCheckbox\"]/parent::div/following-sibling::p-multiselect")
    public WebElement selectorVariedad;

    @FindBy(xpath = "//*[@id=\"ProcedenciaCheckbox\"]")
    public WebElement checkboxProcedenciaRegiones;

    @FindBy(xpath = "//*[@id=\"pn_id_17\"]")
    public WebElement selectorProcedencia;

    @FindBy(xpath = "//app-portal-sidebar/aside/div/div/div/p-card/div/div/div/div/p-button[2]")
    public WebElement btnBuscar;

    //    Configuration de PageFactory
    private WebDriver driver;

    // Crear acciones teclado;
    private Actions teclado;

    public abasteciminetoPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        this.teclado = new Actions(this.driver);
    }

    //    Manejo de las Interacciones con selenium
    public void abrirPaginaSisap() {
        driver.get("http://10.55.74.55:30201/");
    }

    public void clickBotonIngresar() {
        btnIngresar.click();
    }

    public void clickCheboxRegion() {
        chboxRegion.click();
    }

    public void clickOpcionTiempo(String opcion) {

        WebElement elemento = driver.findElement(By.xpath("//*[contains(text(),'" + opcion + "')]"));
        elemento.click();
    }

    public void ingresarFechas(String fechaInicio, String fechaFinal) {
        //Selecionar fecha Inicio
        inputDateInicio.sendKeys(fechaInicio);
        pickerDateInicio.click();
        Tools.stopTime(1);
        if (fechaInicio.contains("/")) {
            pickerDiaSelecionado.click();
        } else {
            pickerMesSelecionado.click();
        }

        //Selecionar fecha Final
        inputDateFinal.sendKeys(fechaFinal);
        pickerDateFinal.click();
        Tools.stopTime(1);
        if (fechaInicio.contains("/")) {
            pickerDiaSelecionado.click();
        } else {
            pickerMesSelecionado.click();
        }

    }

    public void selecionarMercado(String opcion) {
        Tools.selecionarElemento(selectorMercado, "//*[contains(text(),'" + opcion + "')]");
    }

    public void deselecionarTodosProductos() {
        checkboxProducto.click();
    }

    public void seleccionarProducto(String opcion) {
        Tools.selecionarElemento(selectorProducto, "//*[contains(text(),'" + opcion + "')]");
        teclado.keyDown(Keys.ESCAPE).perform();
    }

    public void deselecionarTodasVariedad() {
        checkboxVariedad.click();
    }

    public void seleccionarVariedad(String opcion) {
        Tools.selecionarElemento(selectorVariedad, "//*[contains(text(),'" + opcion + "')]");
        teclado.keyDown(Keys.ESCAPE).perform();
    }

    public void clickCheckBoxProcedenciaRegiones() {
        checkboxProcedenciaRegiones.click();
    }

    public void seleccionarProcedencia(String opcion) {
        Tools.selecionarElemento(selectorProcedencia, "//*[contains(text(),'" + opcion + "')]");
        teclado.keyDown(Keys.ESCAPE).perform();
    }

    public void clickBuscar() {

        btnBuscar.click();
    }
}
