package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "input[id='ctl00_MainContent_username']")
    WebElement username;
    @FindBy(css = "input[id='ctl00_MainContent_password']")
    WebElement password;
    @FindBy(css = "input[id='ctl00_MainContent_login_button']")
    WebElement loginBtn;
    public void authenticate(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }
    public void clickOnLoginButton(){
        this.loginBtn.click();
    }
}
