package pe.gob.midagri.util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tools {

    public static void stopTime(int time) {

        Actions action = new Actions(DriverManager.getDriver());
        action.pause(Duration.ofSeconds(time)).perform();
    }
    public static void stopTimeMili(int time) {

        Actions action = new Actions(DriverManager.getDriver());
        action.pause(Duration.ofMillis(time)).perform();
    }

    public static void selecionarElemento(WebElement selector,String xpathSelecion){
        stopTimeMili(200);
        selector.click();

        WebElement seleccion = DriverManager.getDriver().findElement(By.xpath(xpathSelecion));
        ToolsJS.clickJS(seleccion);

    }
    public static void waitClickableElemento(WebElement elemento,Duration tiempoEspera){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), tiempoEspera);
        WebElement elementoClickeable = wait.until(ExpectedConditions.elementToBeClickable(elemento));
        elementoClickeable.click();

    }
    public static void subirArchivoConRobot(String rutaArchivo) throws AWTException {

        System.setProperty("java.awt.headless", "false"); //Configurar el sistema para que no este en un entorno headless

        // Crea una instancia de Robot

        Robot robot = new Robot();

        // Copia la ruta del archivo al portapapeles

        StringSelection ruta = new StringSelection(rutaArchivo);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ruta, null);
        System.out.println("ruta:"+rutaArchivo);
        // Presiona CTRL + V para pegar la ruta del archivo
        robot.keyPress(KeyEvent.VK_CONTROL);
        Tools.stopTime(1);
        robot.keyPress(KeyEvent.VK_V);
        Tools.stopTime(1);

        robot.keyRelease(KeyEvent.VK_V);
        Tools.stopTime(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Presiona ENTER para confirmar la selección del archivo

        robot.keyPress(KeyEvent.VK_ENTER);
        Tools.stopTime(1);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    public static void subirArchivoConRobot(String rutaArchivo,int time) throws AWTException, InterruptedException {

        Thread.sleep(time);
        subirArchivoConRobot(rutaArchivo);
        Thread.sleep(time);

    }
}
