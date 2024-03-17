package com.tumblr.step_definitions;

import com.tumblr.pages.LoginPage;
import com.tumblr.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Step_defs {
    WebDriver driver=Hook.driver;
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is navigated to main page and click login button")
    public void user_is_navigated_to_main_page_and_click_login_button() {
        mainPage.clickOnLOgin();

    }
    @Then("user enter email as {string} click next")
    public void user_enter_email_as_click_next(String email) throws InterruptedException {
        loginPage.clickOnContinue();
        loginPage.enterEmail(email);



    }
    @Then("user provide password as {string} validate error message as {string}")
    public void user_provide_password_as_validate_error_message_as(String password, String errormessage) {
        loginPage.enterPasswordValidateErrorMsg(password,errormessage);

    }
}
