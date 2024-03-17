package com.qa_fox.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Hook {
    public static WebDriver driver;
    @Before
    public void initializeDriver(){
        driver= DriverHelper.getDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
