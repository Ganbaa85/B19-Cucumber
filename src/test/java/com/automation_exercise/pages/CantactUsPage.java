package com.automation_exercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CantactUsPage {
    public CantactUsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='name']")
    WebElement name;
    @FindBy(css = "input[name='email']")
    WebElement email;
    @FindBy(css = "input[name='subject']")
    WebElement subject;
    @FindBy(css = "textarea[name='message']")
    WebElement message;
    @FindBy(css = "input[name='upload_file']")
    WebElement uploadFile;
    @FindBy(css = "input[name='submit']")
    WebElement submitBtn;
    @FindBy(xpath = "//h2[contains(.,'Contact')]")
    WebElement contactUsText;
    @FindBy(xpath = "//h2[contains(.,'Get')]")
    WebElement getInTouch;
    @FindBy(xpath = "//h2[contains(.,'Feed')]")
    WebElement feedBack;

    public void enterNameEmail(String name, String email) {
        // BDD framework
        // it is recommended strictly follow scenario written
        // in feature file and create methods
        // as per scenarios

        this.name.sendKeys(name);
        this.email.sendKeys(email);


    }

    public void enterSubjectAndMessage(String subject, String message) {
        this.subject.sendKeys(subject);
        this.message.sendKeys(message);


    }

    public void attachFileAndSubmit(String path) {
        this.uploadFile.sendKeys(path);
        this.submitBtn.click();
    }
    public String getTextContactUs(){
        return BrowserUtils.getText(contactUsText);
    }
    public String getTextGetInTouch(){
        return BrowserUtils.getText(getInTouch);
    }
    public String getTextFeedback(){
        return BrowserUtils.getText(feedBack);
    }

}
