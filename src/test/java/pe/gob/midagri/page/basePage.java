package pe.gob.midagri.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pe.gob.midagri.util.DriverManager;
import pe.gob.midagri.util.ToolsJS;

public class basePage {

    //    Configuration de PageFactory
    private WebDriver driver;

    public basePage() {
        this.driver = DriverManager.getDriver();
    }

    // Definimos pasos generales
    public void clickBoton(String nombre) {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + nombre + "')]"));
        ToolsJS.clickJS(element);
    }


}
