package com.webOrder.step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {
    public static WebDriver driver;
    @Before
    public void startUp(){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("webOrderURL"));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
}
