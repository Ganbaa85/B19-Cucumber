package com.automation_exercise.step_definitions;

import com.automation_exercise.pages.CantactUsPage;
import com.automation_exercise.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class StepDefs {
    WebDriver driver = DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);
    CantactUsPage cantactUsPage = new CantactUsPage(driver);


    @Given("User is on main page user clicks on conatact us link")
    public void user_is_on_main_page_user_clicks_on_conatact_us_link() {
        driver.get("https://www.automationexercise.com/");
        //mainPage.clickOnContactUs();

    }

    @When("User is on contact us page user validates url and title of the page")
    public void user_is_on_contact_us_page_user_validates_url_and_title_of_the_page() {
        String expectedURL = "https://www.automationexercise.com/contact_us";
        Assert.assertEquals(expectedURL, driver.getCurrentUrl());
        String expectedTitle = "Automation Exercise - Contact Us";
        Assert.assertEquals(expectedTitle, BrowserUtils.getTitleWithJS(driver));


    }

    @Then("User enters name and email")
    public void user_enters_name_and_email() {
        cantactUsPage.enterNameEmail("ganbaa", "test@email.com");

    }

    @Then("User enters subject of the message and message itself")
    public void user_enters_subject_of_the_message_and_message_itself() {
        cantactUsPage.enterSubjectAndMessage("Hello", "bye bye bye");

    }

    @Then("User attaches file and clicks on submit button")
    public void user_attaches_file_and_clicks_on_submit_button() {
        cantactUsPage.attachFileAndSubmit("/Users/ganbaatarjargal/Desktop/Batch19 hmtl/Cartoon image.jpeg");
        BrowserUtils.acceptAlert(driver);

    }

    @When("User is on contact us page user verifies Contact us text")
    public void user_is_on_contact_us_page_user_verifies_contact_us_text() {
        String expectedText = "CONTACT US";
        Assert.assertEquals(expectedText,cantactUsPage.getTextContactUs());
        String actualText = cantactUsPage.getTextContactUs();
        System.out.println(actualText);

    }
    @Then("User validates Get in touch text")
    public void user_validates_get_in_touch_text() {
        String expectedTextGetInTouch="GET IN TOUCH";
       Assert.assertEquals(expectedTextGetInTouch,cantactUsPage.getTextGetInTouch());
        String actualTextGetInTouch = cantactUsPage.getTextGetInTouch();
        System.out.println(actualTextGetInTouch);

    }
    @Then("User validates Feedback For Us text")
    public void user_validates_feedback_for_us_text() {
        String expectedFeedbackText="FEEDBACK FOR US";
       Assert.assertEquals(expectedFeedbackText,cantactUsPage.getTextFeedback());
        String actualTextFeedback=cantactUsPage.getTextFeedback();
        System.out.println(actualTextFeedback);
    }


}
