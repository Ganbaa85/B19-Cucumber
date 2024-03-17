package com.tumblr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "button[class='dKGjO']")
    WebElement continueWithEmail;
    @FindBy(css = "input[name='email']")
    WebElement email;
    @FindBy(xpath = "//span[.='Next']")
    WebElement nextButton;
    @FindBy(css = "input[name='password']")
    WebElement password;
    @FindBy(xpath = "//p[@class='Ahpp8']//following-sibling::div//span[.='Log in']")
    WebElement loginButton;
    @FindBy(css = "div[class='a0A37 hAkP2']")
    WebElement errorMsg;
    public void clickOnContinue(){
        this.continueWithEmail.click();
    }
    public void enterEmail(String email) throws InterruptedException {
        this.email.sendKeys(email);
        this.nextButton.click();
        Thread.sleep(3000);
    }
    public void enterPasswordValidateErrorMsg(String password,String errorMessage){
        this.password.sendKeys(password);
        this.loginButton.click();
        System.out.println(errorMessage+" error");
        System.out.println(errorMsg.getText());
        Assert.assertEquals(errorMessage,this.errorMsg.getText());

    }



}
