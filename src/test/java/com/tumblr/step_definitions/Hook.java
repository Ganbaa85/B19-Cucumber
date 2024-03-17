package com.tumblr.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Hook {

    public static WebDriver driver;
    @Before
    public void initializeDriver(){
        driver= DriverHelper.getDriver();
        driver.get("https://www.tumblr.com/");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
