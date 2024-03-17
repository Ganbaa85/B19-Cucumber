package com.tumblr.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "button[class='TRX6J CxLjL qjTo7 IMvK3']")
    WebElement loginBtn;
    public void clickOnLOgin(){
        this.loginBtn.click();
    }


}
