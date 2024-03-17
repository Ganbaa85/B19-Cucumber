package com.qa_fox.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/qaFox/login",
        glue = "com/qa_fox/step_definitions",
        dryRun = false,
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}
)

public class Runner {
}
