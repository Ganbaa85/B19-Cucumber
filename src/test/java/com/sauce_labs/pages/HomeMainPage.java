package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomeMainPage {
    public HomeMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//div[@class='header_label']")
    WebElement header;
    public String getHeader(){
        return BrowserUtils.getText(header);
    }
    @FindBy(xpath = "//span[@class='title']")
    WebElement headerOnLeftBar;
    public String getHeaderOnLeftBar(){
        return BrowserUtils.getText(headerOnLeftBar);
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement dropDown;
  public List<WebElement> validateOptionsSelect(){
      return BrowserUtils.getOptions(dropDown);
  }
  public void selectLowToHigh(){
      BrowserUtils.selectBy(dropDown,"Price (low to high)","visibleText");
  }
}
