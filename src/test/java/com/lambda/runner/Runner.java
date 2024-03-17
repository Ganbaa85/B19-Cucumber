package com.lambda.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/lambda/InputForm",
        glue = "com/lambda/step_definitions",
        dryRun = false
)

public class Runner {

}
