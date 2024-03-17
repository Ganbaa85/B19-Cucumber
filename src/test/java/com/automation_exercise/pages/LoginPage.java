package com.automation_exercise.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "input[name='name']")
    WebElement username;
    @FindBy(css = "input[data-qa='signup-email']")
    WebElement email;
    @FindBy(css = "button[data-qa='signup-button']")
    WebElement signUpButton;
    public void enterNameEmail(String username,String email){
        this.username.sendKeys(username);
        this.email.sendKeys(email);
        this.signUpButton.click();
    }


}
