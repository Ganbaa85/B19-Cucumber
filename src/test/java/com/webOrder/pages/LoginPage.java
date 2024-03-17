package com.webOrder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "input[id='Email']")
    WebElement username;
    @FindBy(css = "input[id='Password']")
    WebElement password;
    @FindBy(css = "button[type='submit']")
    WebElement signInButton;

    public void signIn(String username, String password) throws Exception {
        try {
            this.username.clear();
            this.username.sendKeys(username);
            this.password.clear();
            this.password.sendKeys(password);

        } catch (Exception e) {
            throw new Exception
                    ("Something happened when signing in" + e.getMessage());
        }

    }

    public void setSignInButton() throws Exception {
        try {
            this.signInButton.click();
        } catch (Exception e) {
            throw new Exception("Exception occurred when clicking on sing in button" + e.getMessage());
        }
    }

}
