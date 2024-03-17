package com.webOrder.step_defs;

import com.webOrder.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Authentication {
    WebDriver driver=Hook.driver;
    LoginPage loginPage = new LoginPage(driver);


    @Given("user navigate to webOrder page")
    public void user_navigate_to_web_order_page() {
        Assert.assertTrue(driver.getTitle().contains("Weborder") );

    }
    @Then("user clears the username and password then enters the new username as {string} and password as {string}")
    public void user_clears_the_username_and_password_then_enters_the_new_username_as_and_password_as(String username, String password) throws Exception {
        loginPage.signIn(username,password);

    }
    @When("user click the sign in button")
    public void user_click_the_sign_in_button() throws Exception {
        loginPage.setSignInButton();

    }
}
