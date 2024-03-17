package com.smart_bear.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartHook {
    // annotations are not from JUnit
    public static WebDriver driver;
    @Before // this annotation is from io.cucumber.java
    public void initialize(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("smartBearURL"));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
