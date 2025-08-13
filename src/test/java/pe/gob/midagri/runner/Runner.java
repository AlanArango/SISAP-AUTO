package pe.gob.midagri.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"pe.gob.midagri.stepDefinitions", "pe.gob.midagri.config", "pe.gob.midagri.hook"},
        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/simpleReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        stepNotifications = true,
        tags = "@InicioPrecio"

)

public class Runner {

}