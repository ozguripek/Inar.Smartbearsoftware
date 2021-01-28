package com.InarSmartbear.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/InarSmartbear/step_definitions",
        tags = "@login_Page",
        dryRun = false,
        plugin = "html:target/default-report"

        //TODO Extentreport plugin will be used
)
public class LoginPageRunner {
}
