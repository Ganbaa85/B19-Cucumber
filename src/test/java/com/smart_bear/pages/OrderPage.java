package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "select[id='ctl00_MainContent_fmwOrder_ddlProduct']")
    WebElement productSelect;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_txtQuantity']")
    WebElement quantity;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    WebElement price;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_txtDiscount']")
    WebElement discount;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_txtTotal']")
    WebElement total;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_txtName']")
    WebElement name;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox2']")
    WebElement street;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox3']")
    WebElement city;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox4']")
    WebElement state;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox5']")
    WebElement zipCode;
    @FindBy (css = "input[id='ctl00_MainContent_fmwOrder_cardList_0']")
    WebElement radioVisa;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox6']")
    WebElement cardNumber;
    @FindBy(css = "input[id='ctl00_MainContent_fmwOrder_TextBox1']")
    WebElement expirationDate;
    @FindBy(css = "a[id='ctl00_MainContent_fmwOrder_InsertButton']")
    WebElement processButton;
    public void selectSSAndQuantity(String screenSaver,String quantity,WebDriver driver){
        BrowserUtils.selectBy(productSelect,screenSaver,"visibleText");
        BrowserUtils.sendKeys(this.quantity,quantity,driver);

    }
    public void pricaDiscountAndTotal(String price,String discount,String total,WebDriver driver){
        BrowserUtils.sendKeys(this.price,price,driver);
        BrowserUtils.sendKeys(this.discount,discount,driver);
        BrowserUtils.sendKeys(this.total,total,driver);

    }
    public void nameAddress(String name,String address,WebDriver driver){
        BrowserUtils.sendKeys(this.name,name,driver);
        BrowserUtils.sendKeys(this.street,address,driver);
    }
    public void cityStateAndZipCode(String city,String state,String zipcode,WebDriver driver){
        BrowserUtils.sendKeys(this.city,city,driver);
        BrowserUtils.sendKeys(this.state,state,driver);
        BrowserUtils.sendKeys(this.zipCode,zipcode,driver);

    }
    public void checkVisaClickCCAndExpiration(String cc,String expiration,WebDriver driver){
        this.radioVisa.click();
        BrowserUtils.sendKeys(this.cardNumber,cc,driver);
        BrowserUtils.sendKeys(this.expirationDate,expiration,driver);

    }
    public void clickOnProcessButtun() throws InterruptedException {
        this.processButton.click();
        Thread.sleep(3000);
    }



}
