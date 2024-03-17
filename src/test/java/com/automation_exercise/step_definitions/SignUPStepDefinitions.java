package com.automation_exercise.step_definitions;

import com.automation_exercise.pages.LoginPage;
import com.automation_exercise.pages.MainPage;
import com.automation_exercise.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SignUPStepDefinitions {
    WebDriver driver = AutoHook.driver;
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("user is on main page and clicks on login button")
    public void user_is_on_main_page_and_clicks_on_login_button() {
        mainPage.clickLoginButton();


    }

    @When("user enters username as {string} and email as {string} and clicks sign up")
    public void user_enters_username_as_and_email_as_and_clicks_sign_up(String usename, String email) {
        loginPage.enterNameEmail(usename, email);
    }

    @Then("user choose title as MR and validates name that user enters {string}")
    public void user_choose_title_as_mr_and_validates_name_that_user_enters(String name) {
        signUpPage.checkMrvalidateName(name);
    }

    @Then("user verifies that email field is disabled and enters the password {string}")
    public void user_verifies_that_email_field_is_disabled_and_enters_the_password(String password) {
        signUpPage.validateEmailEnterPassword(password);
    }

    @When("user chooses the day {string}, month {string} and year {string}")
    public void user_chooses_the_day_month_and_year(String day, String month, String year) {
        signUpPage.enterBirthdate(day, month, year);

    }

    @Then("user enters first name as {string} last name as {string} and address as {string}")
    public void user_enters_first_name_as_last_name_as_and_address_as(String firstName, String lastName, String address) {
        signUpPage.firstNamelastNameAddress(firstName, lastName, address);

    }

    @When("user chooses the country as {string} provides state as {string} and city as {string}")
    public void user_chooses_the_country_as_provides_state_as_and_city_as(String country, String state, String city) {
        signUpPage.enterCountryStateCity(country, state, city);

    }

    @When("user enters the zipcode {string} and phone number {string} and clicks create account button")
    public void user_enters_the_zipcode_and_phone_number_and_clicks_create_account_button(String zipcode, String phoneNumber) {
        signUpPage.zipCodeAndPhoneNumber(zipcode, phoneNumber);

    }

}
