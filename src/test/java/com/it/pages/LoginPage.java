package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement inputPassword;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;

    //public LoginPage(WebDriver driver) {
       // PageFactory.initElements(driver, this);


    public void login(String name, String password) {
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnSubmit.click();
    }

}

