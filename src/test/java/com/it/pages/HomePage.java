package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
   // WebDriver driver;

    @FindBy(xpath = "//div[@class='section_nav']//li[1]")
    private WebElement labelUserEmail;

  //  public HomePage(WebDriver driver) {
      //  PageFactory.initElements(driver, this);

    public String getLabelUserEmail() {
        return labelUserEmail.getText();
    }

}
