package pe.gob.midagri.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ToolsJS {

    public static void clickJS(WebElement elemento) {
        JavascriptExecutor script=(JavascriptExecutor) DriverManager.getDriver();
        script.executeScript("arguments[0].click()",elemento);
    }

    public static WebElement findElemntJS(String csspath){
        JavascriptExecutor js = (JavascriptExecutor)  DriverManager.getDriver();
        System.out.println("lineaaa"+"return document.querySelector('"+csspath+"')");
        WebElement elemento = (WebElement) js.executeScript("return document.querySelector('"+csspath+"')");
        return elemento;
    }
    public static List<WebElement> findElemntsJS(String csspath){
        JavascriptExecutor js = (JavascriptExecutor)  DriverManager.getDriver();
        System.out.println("lineaaa"+"return document.querySelectorAll('"+csspath+"')");
        List<WebElement> elementos = (List<WebElement>) js.executeScript(
                "return Array.from(document.querySelectorAll(arguments[0]));", csspath
        );
        return elementos;
    }

    public static void ScrolltoElement(WebElement elemento){

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", elemento);
    }
}
