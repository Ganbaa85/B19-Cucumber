package com.lambda.step_definitions;

import com.lambda.pages.InputForm;
import com.lambda.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class InputFormSteps {
    WebDriver driver = Hook.driver;
    MainPage mainPage = new MainPage(driver);
    InputForm inputForm = new InputForm(driver);

    @Given("user is on main page of lambda user clicks on input form submit")
    public void user_is_on_main_page_of_lambda_user_clicks_on_input_form_submit() {
        mainPage.clickOnForm();

    }
    @Then("user enters name email and password as follows")
    public void user_enters_name_email_and_password_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        inputForm.nameEmailPassword(map.get("name"),map.get("email"),map.get("password"));



    }
    @When("user enters company website and select country from dropdown")
    public void user_enters_company_website_and_select_country_from_dropdown(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        inputForm.companyWebsiteCountryDropdown(map.get("company"),map.get("website"),map.get("country"));
    }
    @Then("user enter city also address1 and address2")
    public void user_enter_city_also_address1_and_address2(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        inputForm.cityAddress1AndAddress2(map.get("city"),map.get("address1"),map.get("address2"));

    }
    @When("user enters state and zipcode clicks submit button")
    public void user_enters_state_and_zipcode_clicks_submit_button(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        inputForm.stateZipcode(map.get("state"),map.get("zipcode"));
        inputForm.submitBtn();


    }
    @Then("user validates success massege as follows")
    public void user_validates_success_massege_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        System.out.println(inputForm.submitMessage());
        Assert.assertEquals(map.get("successMessage"),inputForm.submitMessage());

    }
}
