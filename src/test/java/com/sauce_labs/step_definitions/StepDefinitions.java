package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.HomeMainPage;
import com.sauce_labs.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.List;

public class StepDefinitions {
    WebDriver driver = DriverHelper.getDriver();
    HomeMainPage homeMainPage = new HomeMainPage(driver);

    //Scenario 1
    @Given("User is on main page user validate title")
    public void user_is_on_main_page_user_validate_title() {
        String expectedTitle = "Swag Labs";
        String actualTitle = BrowserUtils.getTitleWithJS(driver);
        Assert.assertEquals("expected",expectedTitle,actualTitle);
        System.out.println(actualTitle);

    }

    @Then("User validates url")
    public void user_validates_url() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Failed to validate URL",expectedUrl, actualUrl);

    }

    @Then("User validate main header")
    public void user_validate_main_header() {
        String expectedHeader = "Swag Labs";
        String actualHeader = homeMainPage.getHeader();
        Assert.assertEquals(expectedHeader, actualHeader );


    }

    //Scenario 2
    @When("User is on main page user validates header on the left nav bar")
    public void user_is_on_main_page_user_validates_header_on_the_left_nav_bar() {
        String expectedLeftHeader = "Products";
        String actualLeftHeader = homeMainPage.getHeaderOnLeftBar();
        Assert.assertEquals("failed",expectedLeftHeader,actualLeftHeader);
        System.out.println(actualLeftHeader);
    }

    @Then("User validates all the list of options from the dropdown")
    public void user_validates_all_the_list_of_options_from_the_dropdown() {
        List<WebElement> options = homeMainPage.validateOptionsSelect();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(BrowserUtils.getText(options.get(i)));
            Assert.assertTrue(options.get(i).isDisplayed());


        }

    }

    @Then("User selects price low to high option")
    public void user_selects_price_low_to_high_option() {
        homeMainPage.selectLowToHigh();
    }

}
