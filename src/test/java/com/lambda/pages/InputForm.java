package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class InputForm {
    public InputForm(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#inputEmail4")
    WebElement email;

    @FindBy(css = "#inputPassword4")
    WebElement password;

    @FindBy(css = "#company")
    WebElement company;

    @FindBy(css = "#websitename")
    WebElement website;

    @FindBy(css = "select[name='country']")
    WebElement countryDropdown;

    @FindBy(css = "#inputCity")
    WebElement city;

    @FindBy(css = "#inputAddress1")
    WebElement address1;

    @FindBy(css = "#inputAddress2")
    WebElement address2;

    @FindBy(css = "#inputState")
    WebElement state;

    @FindBy(css = "#inputZip")
    WebElement zipCode;

    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//p[contains(.,'Thanks')]")
    WebElement successMessage;
    public void nameEmailPassword(String name,String email,String password){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.password.sendKeys(password);

    }
    public void companyWebsiteCountryDropdown(String company,String website,String country){
        this.company.sendKeys(company);
        this.website.sendKeys(website);
        BrowserUtils.selectBy(this.countryDropdown,country,"visibleText");


    }
    public void cityAddress1AndAddress2(String city,String address1,String address2){
        this.city.sendKeys(city);
        this.address1.sendKeys(address1);
        this.address2.sendKeys(address2);
    }
    public void stateZipcode(String state,String zipcode){
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipcode);

    }
    public void submitBtn(){
        submitBtn.click();
    }
    public String submitMessage(){
      return BrowserUtils.getText(successMessage);
    }

}
