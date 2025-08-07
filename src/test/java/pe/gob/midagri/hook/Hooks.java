package pe.gob.midagri.hook;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pe.gob.midagri.util.DriverManager;

public class Hooks {

    private static WebDriver driver;

    @Before(order = 1)
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();

    }


    
    @After
    public void tearDown() {
        if (driver != null) {
            //DriverManager.closeDriver();
        }
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {

        if (scenario.isFailed() || true) {

                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Captura:");

        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
