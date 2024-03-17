package com.automation_exercise.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AutomationExercise/singUp", // location of feature files
        glue = "com/automation_exercise/step_definitions", // location of step definitions
        dryRun = false, // triggers that will generate snippets if it is set to "true"
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class AutomationRunner {

}
