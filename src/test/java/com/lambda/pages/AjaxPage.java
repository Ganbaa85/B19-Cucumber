package com.lambda.pages;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AjaxPage {
    public AjaxPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#title")
    WebElement name;
    @FindBy(css = "#description")
    WebElement messageBody;
    @FindBy(css = "#btn-submit")
    WebElement submitBtn;
    @FindBy(css = "#submit-control")
    WebElement ajaxMessageLoading;
    public void nameANdMessage(String name,String messageBody){
        this.name.sendKeys(name);
        this.messageBody.sendKeys(messageBody);

    }
    public void clickOnSubmit(){
        this.submitBtn.click();
    }
    public String getAjaxMessage(){
        return BrowserUtils.getText(ajaxMessageLoading);
    }
}
