package com.webOrder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;

import java.time.Duration;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "label[class='custom-control-label']")
    WebElement groupOrderRadioButton;
    @FindBy(css = "button[type='submit']")
    WebElement nextButton;
    @FindBy(css = "select[name='ConfirmAddressID']")
    WebElement dropDownLocation;
    @FindBy(css = "div[id='addressPreview']")
    WebElement address;
    @FindBy(css = "#InviteNote")
    WebElement inviteNote;
    @FindBy(css = "#InviteList")
    WebElement inviteList;
    @FindBy(css = "#createGroupOrder")
    WebElement createGroupOrderButton;
    @FindBy(tagName = "h1")
    WebElement header;
    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div[contains(text(),'1')]")
    WebElement totalParticipant;

    public void clickOnRadio() throws Exception {
        try {
            groupOrderRadioButton.click();
            this.nextButton.click();
        } catch (Exception e) {
            throw new Exception("Exception occurred when checking radio button" + e.getMessage());
        }
    }

    public void chooseLoactionName(String loaction) throws Exception {

        try {
            BrowserUtils.selectBy(dropDownLocation, loaction, "visibleText");
        } catch (Exception e) {
            throw new Exception("Exception occurred when choosing option in dropdown" + e.getMessage());
        }

    }

    public String getAddressText() {
        return BrowserUtils.getText(address);
    }

    public void sendKeysToGuestNotes(String keys) throws Exception {
        try {
            inviteNote.sendKeys(keys);
        } catch (Exception e) {
            throw new Exception("Exception occurred when sending keys to invite note box" + e.getMessage());
        }

    }

    public void sendKeysGuestLists(String key) throws Exception {
        try {
            inviteList.sendKeys(key);
        } catch (Exception e) {
            throw new Exception("Exception occurred when sending keys to invite list box" + e.getMessage());
        }
    }
    public void clickCreateButton() throws Exception {
        try {
            this.createGroupOrderButton.click();
        } catch (Exception e) {
            throw new Exception("Exception occurred when sending keys to invite list box" + e.getMessage());
        }
    }
    public String getHeaderText(WebDriver driver,String text){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(header,text));

        return BrowserUtils.getText(header);

    }
    public String getParticipant(){
        return BrowserUtils.getText(totalParticipant);
    }



}
